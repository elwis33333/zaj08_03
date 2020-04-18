package visitor;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    private static List<Element> shoppingCart = new LinkedList<>();
    public static void main(String[] args) {
        shoppingCart.add(new Book("Delikatne uderzenie pioruna", 99.99f, 0.8f, 1.04f));
        shoppingCart.add(new Book("Wiedzmin", 29.99f, 1.08f, 1.04f));
        shoppingCart.add(new DiscDVD("Blue Planet II", 120.90f, 0.1f, 1.1f));
        shoppingCart.add(new DiscDVD("Depeche Mode - legacy", 99.99f, 0.1f, 1.1f));
        shoppingCart.add(new Perfume("No.5", 200f, 0.5f, 1.15f));
        shoppingCart.add(new Perfume("Paco", 210f, 0.6f, 1.15f));
        summarizedPrice(shoppingCart);
        calculateWeigth(shoppingCart);
        taxOfPrice(shoppingCart);

    }
    private static void calculateWeigth(List<Element> shoppingCart){
        DeliveryVisitor visitor = new DeliveryVisitor();
        System.out.println(String.format("Total weight:  %.2f", getValue(shoppingCart, visitor)));
    }
    private static void summarizedPrice(List<Element> shoppingCart){
        ShoppingVisitor visitor = new ShoppingVisitor();
        System.out.println(String.format("All costs: %.2f",getValue(shoppingCart, visitor)));
    }
    private static void taxOfPrice(List<Element> shoppingCart){
        TaxVisitor visitor = new TaxVisitor();
        System.out.println(String.format("All tax in costs: %.2f",getValue(shoppingCart, visitor)));
    }
    private static float getValue(List<Element> shoppingCart, MyVisitor visitor){
        float sum = 0f;
        for (Element item: shoppingCart ) {
            sum += item.accept(visitor);
        }
        return sum;
    }
}