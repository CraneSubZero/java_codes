import java.util.Scanner;

public class interactiveUDM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        } catch (Exception e) {
            System.out.println("Invalid input. Please Enter Numeric Values");
        } finally {
            sc.close(); // Close the scanner in the finally block to ensure it always happens
        }
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