import java.util.Scanner;

public class interactiveUDM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initiate the Do While Statement.
        do { // This is the False Path.
            try { // Enable Try Catch

                int a = 0; // Always input both a & b zero.
                int b = 0;

                // Request two integer inputs from the user
                System.out.print("Enter First Number: ");
                a = sc.nextInt();
                System.out.print("Enter Second Number: ");
                b = sc.nextInt();

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