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
                String inputC;
                String inputD;
                String inputE;

                // Request five string inputs from the user
                System.out.print("Enter a First value: ");
                inputA = sc.next();
                System.out.print("Enter a Second Value: ");
                inputB = sc.next();
                System.out.print("Enter a Third Value: ");
                inputC = sc.next();
                System.out.print("Enter a Fourth Value: ");
                inputD = sc.next();
                System.out.print("Enter a Fifth Value: ");
                inputE = sc.next();

                // Convert strings to integers using a try-catch block
                int a, b, c, d, e;
                try {
                    // Assuming that you still wanted to parse the inputs as integers in here.
                    a = Integer.parseInt(inputA);
                    b = Integer.parseInt(inputB);
                    c = Integer.parseInt(inputC);
                    d = Integer.parseInt(inputD);
                    e = Integer.parseInt(inputE);
                } catch (NumberFormatException ex) {
                    throw new IllegalArgumentException("Invalid input. Please enter valid numeric values.");
                }

                System.out.println("Minimum value is: " + minFunc(a, b, c, d, e));
                System.out.println("Maximum value is: " + maxFunc(a, b, c, d, e));

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
                    System.out.println("An unexpected error occurred.");
                }
            } finally {
                sc.nextLine(); // Close the invalid input to avoid an infinite loop within your statements.
            }
        } while (true); // This is the True Path.

        sc.close(); // Close the scanner outside the loop
    }

    public static int minFunc(int a, int b, int c, int d, int e) {
        // Determines the smaller value (min) between five numeric values
        return Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
    }

    public static int maxFunc(int a, int b, int c, int d, int e) {
        // Determines the bigger value (max) between five numeric values
        return Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
    }
}