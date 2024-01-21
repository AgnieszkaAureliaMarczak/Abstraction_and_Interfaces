package challenge;

import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product) {

}

public class Store {

    private static ArrayList<ProductForSale> productsForSale = new ArrayList<>();


    public static void main(String[] args) {
        productsForSale.add(new Dress("Summer Dress", 25.50, "Light summer creation " +
                "from pure cotton"));
        productsForSale.add(new Trousers("Denim Trousers", 39, "Faded men's trousers for " +
                "everyday use"));
        listProducts();
        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrderedItems(order1);

    }

    public static void listProducts() {
        for (var productForSale : productsForSale) {
            System.out.println("-".repeat(30));
            productForSale.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {
        order.add(new OrderItem(quantity, productsForSale.get(orderIndex)));
    }

    public static void printOrderedItems(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedLineItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
