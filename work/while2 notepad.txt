import java.util.Scanner;

class while2 {
    public static void main(String[] args) {
        // Example 2: User Input Validation
        // Ask the user for a positive number
        Scanner scanner = new Scanner(System.in);
        int userInput;

        System.out.print("Enter a positive number: ");
        userInput = scanner.nextInt();

        while (userInput <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            System.out.print("Enter a positive number: ");
            userInput = scanner.nextInt();
        }

        System.out.println("You entered: " + userInput);
        scanner.close();
    }
}
