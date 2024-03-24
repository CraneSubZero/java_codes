import java.util.InputMismatchException;
import java.util.Scanner;

public class samplearray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5]; // Indicate this to enter 5 numbers.
        int sum = 0;

        // This is the part where you tell the user to prompt the Integers that it wants.
        System.out.println("Enter 5 integers:");

        try { // enable the try catch for error catching.
            // Loops 5 times
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("\nInteger " + (i + 1) + ": ");
                numbers[i] = scan.nextInt();
                sum += numbers[i];
            }

            // This is for the sum and average, you will need to put it on a double format since we want to include its decimal point.
            double average = (double) sum / numbers.length;

            // Final Outputs for the Sum and Average.
            System.out.println("\nSum of the numbers: " + sum);
            System.out.println("Average of the numbers: " + average);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter integers only.");
            return; // This will instantly exit if you input a Letter instead of a number therefore, you will only have to input Numbers.
        }

    // This is in case if the User wants to go again for inputing 5 integers.
    boolean validResponse = false; // This will be always false
    while (!validResponse) { // We have now included a while statement in here to loop this statement over and over.
        System.out.print("\nDo you want to go again? (yes/no): ");
            String response = scan.next();
            if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("yes")) { // response.equalsIgnoreCase is different when inputing the character when inputing answer == 'Y' || answer == 'N' || answer == 'y' || answer == 'n'
                validResponse = true;
                main(args); // This will call the main method again on the top.
            } else if (response.equalsIgnoreCase("No") || response.equalsIgnoreCase("no")) { // Please read the comment on the line 38.
                validResponse = true;
                System.out.println("Input ended.");
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'."); // This will catch the error above this will loop nonstop if it catches an error.
            }
        } 
    }
}
