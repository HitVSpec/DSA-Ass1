import java.util.Scanner;

class Product {
    private int pid;
    private double price;
    private static double tot_price;

    public Product(int pid, double price) {
        this.pid = pid;
        this.price = price;
        tot_price += price;
    }

    public void display() {
        System.out.println("Product ID: " + this.pid);
        System.out.println("Price: " + this.price);
    }

    public static double getTotalPrice() {
        return tot_price;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Product[] products = new Product[5];
        double totalPrice = 0.0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for product " + (i+1));
            System.out.print("Enter Product ID: ");
            int pid = x.nextInt();
            System.out.print("Enter Price: $");
            double price = x.nextDouble();
            products[i] = new Product(pid, price);
            totalPrice += price;
        }

        System.out.println("\nDetails of purchased products:");
        for (int i = 0; i < 5; i++) {
            products[i].display();
        }

        System.out.println("\nTotal price of purchased products: " + Product.getTotalPrice());
    }
}