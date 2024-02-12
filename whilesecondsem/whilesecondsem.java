import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

class WhileSecondSem {
    public static void main(String[] args) {

        // Declare variables & objects
        double x, y, z;
        double ave, sum, prod;
        char answer = 'y'; // 'Y' or 'N' for yes or no
        DecimalFormat df = new DecimalFormat("#,###,###.##");

        Scanner sc = new Scanner(System.in);

        // Inputs
        while (answer == 'Y' || answer == 'y') { // Pre-test Loop

            try {

                System.out.print("Enter number 1: ");
                x = sc.nextDouble();

                System.out.print("Enter number 2: ");
                y = sc.nextDouble();

                System.out.print("Enter number 3: ");
                z = sc.nextDouble();

                sum = (x + y + z);
                ave = (sum / 3);
                prod = (x * y * z);

                System.out.println("Sum: " + df.format(sum));
                System.out.println("Average: " + df.format(ave));
                System.out.println("Product: " + df.format(prod));

                boolean invalidInput = true;
                do {
                    System.out.print("Do you want to go again?[Y/N]");
                    answer = sc.next().toUpperCase().charAt(0);
                    System.out.println("");

                    if (answer == 'Y' || answer == 'N') {
                        invalidInput = false;
                    } else {
                        System.out.println("Invalid input. Please enter 'Y' or 'N'.");
                    }
                } while (invalidInput);

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numeric values.");
                sc.nextLine(); // Clear the buffer
            }
        }

        sc.close();
    }
}
