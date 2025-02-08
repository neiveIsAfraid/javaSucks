package Inventory;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        System.out.println("Inventory Application");
        while (true){
            try {
                System.out.print("Enter Menu: " +
                        "\n1. Display added products" +
                        "\n2. Add a product" +
                        "\n3. Remove a product" +
                        "\n4. Add product to inventory" +
                        "\n5. Remove product from inventory" +
                        "\n6. Display products in the inventory" +
                        "\n7. Exit this application\n: ");
                Scanner scanner = new Scanner(System.in);
                int choice = 0;
                try {
                    choice = scanner.nextInt();
                } catch (Exception e){
                    System.out.println("Please enter a valid option!");
                }

                if (choice == 1){
                    try{
                       Product.getAddedProducts();
                    } catch (Exception e) {
                        System.out.println("You don't have any products yet");;
                    }
                } else if (choice == 2){
                    Product.newProduct();
                } else if (choice == 3){
                    Product.removeAddedProduct();
                } else if (choice == 4){
                    inventory.addProductToInventory();
                } else if (choice == 5){
                    inventory.removeProduct();
                } else if (choice == 6){
                    inventory.getProducts();
                } else if (choice == 7){
                    break;
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
