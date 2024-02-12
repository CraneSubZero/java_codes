import java.util.Scanner;
public class testing123 {
	public static void main(String[] args) {

		// let's review the code from last sem
		System.out.println("Telephone Ringing: Binary Selection Example");
		System.out.println();

		char answer =' ';
		Scanner sc = new Scanner(System.in);

		System.out.print("Is the Telephone ringing? (Y/N)");
		answer = sc.next().charAt(0);

		 if (answer == 'y' || answer == 'Y') {
            System.out.println("Answer the telephone."); // Apply the value of 'y' or 'Y'.
        } else {
            System.out.println("Do not answer the telephone."); // Any value will apply.
        }
	}
}