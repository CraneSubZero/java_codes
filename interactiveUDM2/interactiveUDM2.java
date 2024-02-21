import java.util.Scanner;

public class interactiveUDM2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initiate the Do While Statement.
        do { // This is the False Path.
            try { // Enable Try Catch

                // Use strings to store user input
                String inputA;
                String inputB;

                // Request two integer inputs from the user as strings
                System.out.print("Enter a First Word: ");
                inputA = sc.next();
                System.out.print("Enter a Second Word: ");
                inputB = sc.next();

                // Convert strings to integers
                int a = Integer.parseInt(inputA);
                int b = Integer.parseInt(inputB);

                System.out.println("Minimum value is: " + minFunc(a, b));
                System.out.println("Maximum value is: " + maxFunc(a, b));

                // Ask the user if they want to go again
                System.out.print("Do you want to go again? (Y/N): ");
                String goAgain = sc.next();

                // Use if-else statement
                if (goAgain.equalsIgnoreCase("N")) {
                    break; // Exit the loop if the user does not want to go again
                } else if (!goAgain.equalsIgnoreCase("Y")) {
                    throw new IllegalArgumentException("Invalid input. Please enter 'Y' or 'N'.");
                }

            } catch (Exception e) {
                if (e instanceof IllegalArgumentException) {
                    System.out.println(e.getMessage());
                } else {
                    System.out.println("Invalid input. Please Enter Numeric Values");
                }
            } finally {
                sc.nextLine(); // Consume the invalid input to avoid an infinite loop
            }
        } while (true); // This is the True Path.

        sc.close(); // Close the scanner outside the loop
    }

    public static int minFunc(int a, int b) {
        // Determines the smaller value (min) between two numeric values
        return Math.min(a, b);
    }

    public static int maxFunc(int a, int b) {
        // Determines the bigger value (max) between two numeric values
        return Math.max(a, b);
    }
}