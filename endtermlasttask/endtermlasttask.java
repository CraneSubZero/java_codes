import java.util.Scanner;
import java.text.DecimalFormat;

public class endtermlasttask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("###,###,###,###.##");

        System.out.print("Enter the first letter of the shape (C for Circle, T for Triangle, S for Square): ");
        char choice = sc.next().charAt(0);

        switch (Character.toUpperCase(choice)) {
            case 'C':
                calculateCircleArea(sc, numberFormat);
                break;
            case 'T':
                calculateTriangleArea(sc, numberFormat);
                break;
            case 'S':
                calculateSquareArea(sc, numberFormat);
                break;
            default:
                System.out.println("Invalid choice. Please enter C, T, or S.");
        }

        sc.close();
    }

    public static void calculateCircleArea(Scanner sc, DecimalFormat numberFormat) {
        double radius, area;
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + numberFormat.format(area) + " square units.");
    }

    public static void calculateTriangleArea(Scanner sc, DecimalFormat numberFormat) {
        double height, base, area;
        System.out.print("Enter the height of the triangle: ");
        height = sc.nextDouble();
        System.out.print("Enter the base of the triangle: ");
        base = sc.nextDouble();
        area = 0.5 * height * base;
        System.out.println("The area of the triangle is " + numberFormat.format(area) + " square units.");
    }

    public static void calculateSquareArea(Scanner sc, DecimalFormat numberFormat) {
        double height, width, area;
        System.out.print("Enter the height of the square: ");
        height = sc.nextDouble();
        System.out.print("Enter the width of the square: ");
        width = sc.nextDouble();
        area = height * width;
        System.out.println("The area of the square is " + numberFormat.format(area) + " square units.");
    }
}
