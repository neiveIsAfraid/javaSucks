
package Inventory;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    private String name;
    private int quantity;
    private static ArrayList<Product> addedProducts = new ArrayList<Product>();

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public static void newProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String input = scanner.nextLine();
        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();
        Product product = new Product(input, quantity);
        addedProducts.add(product);
    }

    public static void removeAddedProduct() {
      getAddedProducts();
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter product number: ");
      int input = scanner.nextInt();
      addedProducts.remove(input);

    }
    public static void removeAddedProduct(int index) {
        addedProducts.remove(index);
    }

    public static void getAddedProducts() {
        int counter = 0;
        for (Product product : addedProducts) {
            System.out.println(counter + "." + product.getName());
            counter++;
        }
    }

    public static Product getProductByIndex(int index) {
        return addedProducts.get(index);
    }

    @Override
    public String toString() {
                return "Name: " + name + '\n' + "Quantity: " + quantity + '\n';
    }
}
