import java.util.InputMismatchException;
import java.util.Scanner;

public class infiloop {

    public static void main(String[] args) {

        int sum = 0;
        final int exitNumber = 0; // Specify the number to exit the loop

        Scanner input = new Scanner(System.in);

        for (;;) {  // Infinite loop, you can use "while (true)" as well

            try {
                System.out.println("Enter a number (or " + exitNumber + " to exit):");
                if (input.hasNextInt()) {
                    int number = input.nextInt();

                    if (number == exitNumber) {
                        break;
                    } else if (number > 17) {
                        sum += number;
                    } else {
                        System.out.println("Number should be greater than 17. Try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    input.next(); // Clear the invalid input
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                input.next(); // Clear the invalid input
            }
        }

        System.out.println("Sum = " + sum);
        input.close();
    }
}
