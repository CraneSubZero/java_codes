import java.util.Scanner;
public class teamtaskendterm1 {

	public static void main(String[] args) {


		System.out.println("Traffic Light: A selection of Red Light and Green Light"); // Title of the Task
		System.out.println();

		char answer = ' ';
		Scanner sc = new Scanner(System.in); // Initiate Scanner

		System.out.print("Is the Traffic Light Green?"); // This is a Question Box
		answer = sc.next().charAt(0);

		if (answer == 'y' || answer == 'Y') {
    		System.out.println("Proceed through the intersection"); // TRUE Statement

	  } else if (answer == 'n' || answer == 'N') {
    		System.out.println("Stop the Vehicle."); // FALSE Statement
		
		}
	}
}