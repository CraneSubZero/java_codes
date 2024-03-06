import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int a, b;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value for A: ");
		a = sc.nextInt();
		System.out.print("Enter value for B: ");
		b = sc.nextInt();

		int sum = MyMath.addTwoNumbers(a, b);
		int diff = MyMath.subTwoNumbers(a, b);

		System.out.println("The SUM is: " + sum);
		System.out.println("The DIFFERENCE is: " + diff);

	}
	
}