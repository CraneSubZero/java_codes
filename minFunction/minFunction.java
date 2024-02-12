import java.util.Scanner; // Initiate the Scanner Input Output Process.

public class minFunction {

    public static void main(String[] args) {
        char answer = ' ';
        Scanner input = new Scanner(System.in); // This will preview in the Terminus on what is the higher value of your integer.

        System.out.print("Enter a number:");
        int x = input.nextInt(); // First Input.

        System.out.print("Enter a number:");
        int y = input.nextInt(); // Second Input.

        System.out.print("Enter a number:");
        int v = input.nextInt(); // Third Input.

        int z = maximumvalue(x, y, v); // Function Value that will Display the values.

        System.out.println("The LARGEST value is " + z); // This is the Answer.
    }

    public static int maximumvalue(int a, int b, int c) {
        // This method finds the larger value among three integers and my first UDM.

        int maxvalue;

        if (a >= b && a >= c) { // Start with the if Statement. This will always be the True Path.
            maxvalue = a;
        } else if (b >= a && b >= c) { // This will still be a True Path.
            maxvalue = b;
        } else { // This is now a False Path since were indicating the "LARGER" Value instead of the "SMALL" Value.
            maxvalue = c;
        }

        return maxvalue; // Return the Value up top (Volleyball Serve and Return Service toss.)
    }
}
