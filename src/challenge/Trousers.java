package challenge;

public class Trousers extends ProductForSale {
    public Trousers(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getName() + ", price is $" + price + ". Description: " + description);
    }
}
