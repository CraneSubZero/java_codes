import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            try {

                String name;
                double workrate = 0;
                double numberofdays = 0;
                double mediacare = 0;
                double advances = 0;
                double incometaxes = 0;

                System.out.print("Enter Employee Name: ");
                name = sc.nextLine(); // Fix variable name and use 'sc' instead of 'scanner'
                System.out.print("Enter Daily Work Rate: ");
                workrate = sc.nextDouble();
                System.out.print("Enter Number of Days Worked: ");
                numberofdays = sc.nextDouble();
                System.out.print("Enter Mediacare deduction: ");
                mediacare = sc.nextDouble();
                System.out.print("Enter Advances deduction: ");
                advances = sc.nextDouble();
                System.out.print("Enter income taxes deduction: ");
                incometaxes = sc.nextDouble();

                double productResult = grosspay(workrate, numberofdays);
                double sumResult = totaldeductionamount(mediacare, advances, incometaxes);
                double differenceResult = netpay(productResult, sumResult);

                System.out.println("\nEmployee Name: " + name);
                System.out.println("Gross Pay: " + productResult);
                System.out.println("Total Deduction: " + sumResult);
                System.out.println("Net Pay: " + differenceResult);

                System.out.print("\nDo you want to go again? (Y/N): ");
                String goAgain = sc.next();

                if (goAgain.equalsIgnoreCase("N")) {
                    break;
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
                sc.nextLine();
            }
        } while (true);

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