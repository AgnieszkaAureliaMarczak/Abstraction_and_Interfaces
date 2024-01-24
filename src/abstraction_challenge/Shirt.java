package abstraction_challenge;

public class Shirt extends ProductForSale{
    public Shirt(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Details of Shirt");
    }
}
