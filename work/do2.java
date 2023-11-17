import java.util.Scanner;

 class do2 {
    public static void main(String[] args) {
        // Example 2: User Input Validation with Do-While
        // Ask the user for a positive number
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            System.out.print("Enter a positive number: ");
            userInput = scanner.nextInt();

            if (userInput <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        } while (userInput <= 0);

        System.out.println("You entered: " + userInput);
        scanner.close();
    }
}