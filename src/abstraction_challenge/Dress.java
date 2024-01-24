package abstraction_challenge;

public class Dress extends ProductForSale{
    public Dress(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getName() + " " + type + ". Price: $" + price + ". Description: " + description);
    }
}
