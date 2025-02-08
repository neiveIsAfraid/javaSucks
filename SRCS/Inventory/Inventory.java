//Write a Java program to create a class called "Inventory"
// with a collection of products and methods to add and remove products, and to check for low inventory.
package Inventory;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        this.products = new ArrayList<Product>();
    }

    public void addProductToInventory() {
        Product.getAddedProducts();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter product number: ");
        int index = scanner1.nextInt();
        products.add(Product.getProductByIndex(index));
        Product.removeAddedProduct(index);
    }

    public void removeProduct() {
        getProducts();
        System.out.print(": ");
        Scanner scanner1 = new Scanner(System.in);
        int index = scanner1.nextInt();
        this.products.remove(index);
    }

    public void getProducts() {
        int counter = 0;
        for (Product product : products) {
            System.out.println(counter + ". " + product);
            counter++;
        }
    }

    public void getLowQuantity() {
        for (Product product : products) {
            if (product.getQuantity() <= 100){
                System.out.println("Product " + product.getName() + " is low on quantity\n" +
                        "Quantity: " + product.getQuantity());
            }
        }
    }

}
