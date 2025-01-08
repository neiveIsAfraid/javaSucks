import java.util.Scanner;

public class BetterEqualChecker {
    public static void main(String[] args) {
        System.out.print("Welcome to our progam\nContinue: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();


        if (userInput.equals("Yes")) {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            scanner.close();

            compare(num1,num2);
        } else {
            System.out.print("Bye");
        }
    }
    static void compare(int satu, int dua) {
        if (satu == dua) {
            System.out.println("Yes, " + satu + " and " + dua + " is equal");
        }else {
            System.out.println("No, " + satu + " and " + dua + " is not equal");
        }
    }
}
