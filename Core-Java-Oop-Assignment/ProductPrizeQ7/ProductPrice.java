
    class Product {
    // Private variable (cannot be accessed directly)
    private double price;

    // Setter method to assign value
    public void setPrice(double p) {
        price = p;
    }

    // Getter method to retrieve value
    public double getPrice() {
        return price;
    }
}

public class ProductPrice {
    public static void main(String[] args) {
        Product p1 = new Product();

        // Set price using setter
        p1.setPrice(2000.75);

        // Access price using getter
        System.out.println("Product Price: " + p1.getPrice());
    }
}


