import java.util.Scanner; // Needed for Activation
import java.text.DecimalFormat; // Needed for Activation
public class prelimint {
    public static void main(String[] args) {
        Double Prelim, Midterm, Endterm, FinalGrade;
        Scanner input = new Scanner(System.in); // Initiate the Scanner Format
        DecimalFormat df = new DecimalFormat("##.##"); // Initiate the Decimal Format

        //Try .. catch error trap
        try {

        // Input for the first number
        System.out.println("Enter the first number: ");
        Prelim = input.nextDouble();

        // Input for the second number
        System.out.println("Enter the second number: ");
        Midterm = input.nextDouble();

        // Input for the third number
        System.out.println("Enter the third number: ");
        Endterm = input.nextDouble();

        // Calculate and display the Final Grade
        FinalGrade = (Prelim * .30) + (Midterm * .30) + (Endterm * .40); // Find the Average
        System.out.println("Final Grade (Weights): " + FinalGrade);

        // Calculate and display the average
        FinalGrade = (Prelim + Midterm + Endterm) / 3; // Find the Average
        System.out.println("Final Grade (Average): " + FinalGrade);

    } catch (Exception e) {
    	System.out.println("Something went wrong.");
    }
   }
}
