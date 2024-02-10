import java.util.Scanner;

public class midtermteam1ccc202pt2{
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);

        // Input for the first number
        System.out.println("Enter the first number: ");
        num1 = input.nextInt();

        // Input for the second number
        System.out.println("Enter the second number: ");
        num2 = input.nextInt();

        // Input for the third number
        System.out.println("Enter the third number: ");
        num3 = input.nextInt();

        // Calculate and display the quotient
        int average = num1 + num2 + num3 / 3;
        System.out.println("Average of these numbers: " + average);

        // Calculate and display the difference
        int square = num2 * num2;
        System.out.println("Square of these numbers: " + square);

        // Calculate and display the product
        int cube = num3 * num3 * num3;
        System.out.println("Cube of these numbers: " + cube);
    }
}