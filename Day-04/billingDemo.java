
class Review {
    double billing(double price1, double price2) {
        return price1 + price2;
    }
}

class ProductBilling {
    public double calculateBill(double price1) {
        return price1;
    }

    public double calculateBill(double price1, double price2) {
        return price1 + price2;
    }

    public double calculateBill(double price1, double price2, double price3) {
        return price1 + price2 + price3;
    }
}

public class billingDemo {
    public static void main(String[] args) {
        ProductBilling billing = new ProductBilling();
        // assigning singal values
        double bill1 = billing.calculateBill(100.50);
        // assigning Two values
        double bill2 = billing.calculateBill(100.50, 200.75);
        // assigning three values
        double bill3 = billing.calculateBill(100.50, 200.75, 150.25);

        // DISPLAY ALL THE BILL AS FINAL OUTPUT
        System.out.println("Bill of  1 product: " + bill1);
        System.out.println("Bill of 2 products: " + bill2);
        System.out.println("Bill of 3 products: " + bill3);
    }
}
