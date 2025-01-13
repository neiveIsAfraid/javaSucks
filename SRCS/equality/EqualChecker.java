import java.util.Scanner;

public class EqualChecker {
    public static void main(String[] args) {
        System.out.println("Welcome to the number checker\nWould you like to continue ?");
        String userInput = " ";
        try (Scanner scanner = new Scanner(System.in)){
            userInput = scanner.nextLine();
            //userInput.skip("\n");
        } catch (Exception e) {
            System.out.println("Failed\nExplanation:\n" + e.getMessage());
        }
        System.out.println(userInput);
        if (userInput.equals("Y") || userInput == "y" || userInput.equals("Yes")){
            System.out.println("Enter the first number: ");
            int num1 = 0;
            try (Scanner scanner2 = new Scanner(System.in)){
                num1 = scanner2.nextInt();
            } catch (Exception e) {
                System.out.println("Failed\nExplanation:\n" + e);
            }

            System.out.println("Enter the second number: ");
            int num2 = 0;
            try (Scanner scanner = new Scanner(System.in)){
                num2 = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Failed\nExplanation:\n" + e.getMessage());
            }
            compare(num1, num2);
        }
    }

    static void compare (int number1, int number2) {
        if (number1 == number2) {
            System.out.println("Number Equal");
        } else {
            System.out.println("Number Not Equal");
        }
    }
}
