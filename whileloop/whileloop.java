import java.util.Scanner;
public class whileloop {

	public static void main(String[] args) {

		int number, i;
		Scanner sc=new Scanner(System.in);
		number = sc.nextint(); // This is a Scanner for the Number that needs to be added in the while loop statement.


		System.out.println("First 20 Odd Integers:"); // The Statement.

		int i = 1;

		while (i <= 39)  {
			System.out.println(i);
			i += 2;
		}
	}
}