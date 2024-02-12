import java.util.Scanner;

public class quotient{
    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner input = new Scanner(System.in);

        // Input for the first number
        System.out.println("Enter the first number: ");
        num1 = input.nextDouble();

        // Input for the second number
        System.out.println("Enter the second number: ");
        num2 = input.nextDouble();

        // Input for the third number
        System.out.println("Enter the third number: ");
        num3 = input.nextDouble();

        // Calculate and display the quotient
        double quotient = num1 / num2 / num3;
        System.out.println("Quotient of these numbers: " + quotient);

        // Calculate and display the difference
        double difference = num1 - num2 - num3;
        System.out.println("Difference of these numbers: " + difference);

        // Calculate and display the product
        double product = num1 * num2 * num3;
        System.out.println("Product of these numbers: " + product);
    }
}