package interfaces_challenge;

enum UsageType{
    ENTERTAINMENT,
    GOVERNMENT,
    RESIDENTIAL,
    SPORTS;
}

public class Building implements Mappable {

    private String name;

    private UsageType type;

    public Building(String name, UsageType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ")";
    }

    @Override
    public String getMarker() {
        return switch(type){
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMarker.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarker.SQUARE;
            case SPORTS -> Color.ORANGE + " " + PointMarker.PUSH_PIN;
            default -> Color.BLACK + " " + PointMarker.CIRCLE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "usage": "%s" """.formatted(name,type);
    }
}
