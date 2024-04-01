import java.text.DecimalFormat; // Apply the Decimal Format 
import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            try {

                // Employee Name
                // Daily Work Rate
                // Mediacare deduction
                // Advances deduction
                // Income taxes deduction

                DecimalFormat df = new DecimalFormat("0.00"); // Enable the Decimal Format
                String name;
                double workrate = 0.00;
                double numberofdays = 0.00;
                double mediacare = 0.00;
                double advances = 0.00;
                double incometaxes = 0.00;

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

                // Format each formula from Grosspay, total deduction amount, and netpay

                double productResult = grosspay(workrate, numberofdays);
                double sumResult = totaldeductionamount(mediacare, advances, incometaxes);
                double differenceResult = netpay(productResult, sumResult);

                System.out.println("\nEmployee Name: " + name);
                System.out.println("Gross Pay: " + productResult);
                System.out.println("Total Deduction: " + sumResult);
                System.out.println("Net Pay: " + differenceResult);

                System.out.print("\nDo you want to go again? (Y/N): ");
                String goAgain = sc.next();

                 if (goAgain.equalsIgnoreCase("N") || goAgain.equalsIgnoreCase("n")) { // instead of using answer == "Y" or answer == "N" use equalsIgnoreCase
                    break;
                } else if (!goAgain.equalsIgnoreCase("Y") && ! goAgain.equalsIgnoreCase("y")) { // please read line 54 comment
                    throw new IllegalArgumentException("Invalid input. Please enter 'Y' or 'N'."); // looped error
                }

            } catch (Exception e) { // catches the error
                if (e instanceof IllegalArgumentException) {
                    System.out.println(e.getMessage());
                } else {
                    System.out.println("Invalid input. Please Enter Numeric Values");
                }
            } finally {
                sc.nextLine(); // generates extra next line for the leftover line.
            }
        } while (true);

        sc.close();
    }

    public static double grosspay(double workrate, double numberofdays) { // first udm
        return workrate * numberofdays;
    }

    public static double totaldeductionamount(double mediacare, double advances, double incometaxes) { // second udm
        return mediacare + advances + incometaxes;
    }

    public static double netpay(double grosspay, double totaldeductionamount) { // third udm
        return grosspay - totaldeductionamount;
    }
}