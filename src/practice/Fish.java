package practice;

public class Fish extends Animal {

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.print(getExplicitType() + " lazily swimming ");
        } else {
            System.out.print(getExplicitType() + " duck behind something ");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "Goldfish") {
            System.out.println("swish ");
        } else {
            System.out.println("splash ");
        }
    }
}
