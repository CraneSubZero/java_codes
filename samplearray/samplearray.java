import java.util.Scanner;

public class samplearray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5]; // Indicate this to enter 5 numbers.
        int sum = 0;

        // This is the part where you tell the user to prompt the Integers that it wants.
        System.out.println("Enter 5 integers:");

        // Loops 5 times
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("\nInteger " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }

        // This is for the average, you will need to put it on a double format since we want to include its decimal point.
        double average = (double) sum / numbers.length;

        // Final Outputs for the Sum and Average.
        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}