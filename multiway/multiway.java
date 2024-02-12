import java.util.InputMismatchException; // This is for the double catch below.
import java.util.Scanner;

class Multiway {
    public static void main(String[] args) {
        int month = 0; // Use the Int Formula
        Scanner sc = new Scanner(System.in); // Enable the Scanner.

        try { // Enable Try Catch
            int count = 0; // Indicate the count format to lock out the values.
            System.out.print("Enter a Month Number: ");
            month = sc.nextInt(); // Scanner

            if (month < 1 || month > 12) { // Numerical Values that are indicated within the Switch.
                throw new IllegalArgumentException("Invalid input. Please enter a number between 1 and 12."); // Second Try Catch Error
            }

            switch (month) { // Start the Switch
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
            } // Close.
            count++; // Move count++ outside the switch block to lock out the value.
        } catch (InputMismatchException e) {  // First Catch
            System.out.println("Invalid input. Please enter a valid numeric value."); // First Try Catch Error.
        } catch (IllegalArgumentException e) { // Second Catch
            System.out.println(e.getMessage()); // Catches the Throw Argument at line 15.
        } finally { // Close the Catch.
            sc.close(); // Notice that we have two Try Catch beneath here, these are important values to properly execute the Switch Case Statement.
        }
    }
}
