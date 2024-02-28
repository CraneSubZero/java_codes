import java.util.Scanner; // Flagged for Prelim Second Sem

public class PayrollCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initiate the Do While Statement.
        do { // This is the False Path.
            try { // Enable Try Catch

                String name; // Always input both a to e zero.
                double workrate = 0;
                double numberofdays = 0;
                double mediacare = 0;
                double advances = 0;
                double incometaxes = 0;

                // Request five integer inputs from the user
                System.out.print("Enter Employee Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Daily Work Rate: ");
                workrate = sc.nextInt();
                System.out.print("Enter Number of Days Worked: ");
                numberofdays = sc.nextInt();
                System.out.print("Enter Enter Mediacare deduction: ");
                mediacare = sc.nextInt();
                System.out.print("Enter Advances deduction: ");
                advances = sc.nextInt();
                System.out.print("Enter income taxes deduction: ");
                incometaxes = sc.nextInt();


                double productResult = grosspay(workrate, numberofdays);
                double sumResult = totaldeductionamount(mediacare, advances, incometaxes);
                double differenceResult = netpay(grosspay, totaldeductionamount);

                System.out.println("Employee Name: " name);
                System.out.println("Gross Pay: " productResult);
                System.out.println("Total Deduction: " sumResult);
                System.out.println("Net Pay: " differenceResult);

                // Ask the user if they want to go again
                System.out.print("Do you want to go again? (Y/N): ");
                String goAgain = sc.next();

                // Use if-else statement
                if (goAgain.equalsIgnoreCase("N")) {
                    break; // Exit the loop if the user does not want to go again
                } else if (!goAgain.equalsIgnoreCase("Y")) {
                    throw new IllegalArgumentException("Invalid input. Please enter 'Y' or 'N'.");
                }

            } catch (Exception e) {
                if (e instanceof IllegalArgumentException) {
                    System.out.println(e.getMessage());
                } else {
                    System.out.println("Invalid input. Please Enter Numeric Values");
                }
            } finally {
                sc.nextLine(); // Close the invalid input to avoid an infinite loop within your statements.
            }
        } while (true); // This is the True Path.
    sc.close();
    } 

    
    public static double grosspay(double workrate, double numberofdays) {
        return workrate * numberofdays;
    }

    
    public static double totaldeductionamount(double mediacare, double advances, double incometaxes) {
        return mediacare + advances + incometaxes;
    }

    
    public static double netpay(double grosspay, double totaldeductionamount) {
        return grosspay - totaldeductionamount;
    }
}       
