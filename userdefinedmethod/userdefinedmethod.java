import java.util.Scanner;

public class userdefinedmethod {

    public static void main(String[] args) {

        // Variable declaration //
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;

        // Request two double inputs from user //
        System.out.print("Enter First Number: ");
        a = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        b = sc.nextDouble();
        sc.close(); // this releases the scanner object

        // Perform arithmetic operations and display results //
        double sumResult = addFunc(a, b);
        double differenceResult = subtractFunc(a, b);
        double productResult = multiplyFunc(a, b);
        double quotientResult = divideFunc(a, b);

        // Display results //
        System.out.println();
        System.out.println("The sum of " + a + " and " + b + " is " + sumResult);
        System.out.println("The difference of " + a + " and " + b + " is " + differenceResult);
        System.out.println("The product of " + a + " and " + b + " is " + productResult);
        System.out.println("The quotient of " + a + " and " + b + " is " + quotientResult);

    }

    /** This method ADDS two numbers **/
    public static double addFunc(double n1, double n2) {
        return n1 + n2;
    }

    /** This method SUBTRACTS two numbers **/
    public static double subtractFunc(double n1, double n2) {
        return n1 - n2;
    }

    /** This method MULTIPLIES two numbers **/
    public static double multiplyFunc(double n1, double n2) {
        return n1 * n2;
    }

    /** This method DIVIDES two numbers **/
    public static double divideFunc(double n1, double n2) {
        // Check for division by zero
        if (n2 != 0) {
            return n1 / n2;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; // Return NaN (Not a Number) for division by zero
        }
    }
}