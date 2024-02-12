import java.util.Scanner;
import java.text.DecimalFormat;

class dowhilesecondsem {
    public static void main(String[] args) {
        
        //Declare variables & objects
        double x, y, z;
        double ave, sum, prod;
        char answer = 'y'; // 'Y' or 'N' for yes or no
        DecimalFormat df = new DecimalFormat("#,###,###.##"); // Indicate the Decimal Values
        
        Scanner sc = new Scanner(System.in);
        
        //Inputs
        try {

            do { // Post-test Loop    

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

                    if (answer == 'Y' || answer == 'N' || answer == 'y' || answer == 'n') { // values that are needed to be entered.
                    invalidInput = false;
                    } else {
                    System.out.println("Invalid input. Please enter 'Y' or 'N'."); // This is for the second error for the choices.
                }

                } while (invalidInput); // This is for the second 'do while.' 


            }
            while (answer == 'Y' || answer == 'y'); // This is for the first 'do while.'

        } catch (Exception e) {
                    
            System.out.println("Invalid input. Please Enter Numeric Values"); // This is for the first error for the numerical values.
            } finally {
            sc.close(); // Clear the buffer
        }
          
    }
}
