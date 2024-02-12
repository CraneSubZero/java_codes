import java.util.Scanner;
import java.text.DecimalFormat;

public class loop {
    public static void main(String[] args) {
        Double avg = 0.0; // Must have an indication for decimal point since you have a decimal format below.
        Double sum = 0.0; // The same goes with this code
        Double product = 1.0; // and this code.
        Double number; // leave this as is.

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");

        try {
            int count = 0; // Always indicate "count" in order to not get errors.

            do { // This is the False path.
                System.out.println("Enter a Number:");
                number = input.nextDouble();

                if (number >= 0) {
                    avg += number; // += are always an indicators for average the same goes with the sum below.
                    sum += number;
                    product *= number; // use *= since its multiplication.
                    count++; // Lock the loop.

                    // Ask the user if they want to continue.
                    System.out.print("Do you want to enter another number? (yes/no): "); // This is the Loop Statement.
                    String response = input.next().toLowerCase();

                    if (!response.equals("yes")) {
                        break;
                    }
                }
            } while (true); // This is the True path.

            if (count > 0) {
                avg /= count;
            }

            System.out.println("Average = " + df.format(avg)); // Average
            System.out.println("Sum = " + sum); // Sum
            System.out.println("Product = " + product); // Product

            input.close(); // Input this once.
        } catch (Exception e) {
            System.out.println("Something went wrong."); // Enable the Try Catch Sequence.
        }
    }
}
