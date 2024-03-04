public class parameterpassing {

	public static void main(String[] args) {
		int a = 420;
		int b = 900;
		System.out.println("Before swapping, a = " + a + " and b = " + b);

		// Invoke the swap method
		swapFunction(a, b);
		System.out.println("\n**Now, Before and After swapping values will be same here**:"); // The "\n" function serves as an "enter" button to skip the line the terminus.
		System.out.println("After swapping, a = " + a + " and b is " + b);	
	}

	public static void swapFunction(int a, int b) { // Since its void, there will be no Return Value.
		System.out.println("before swapping(Inside), a = " + a + " b = " + b);

		// Swap n1 with n2
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping(inside), a = " + a + " b = " + b);
	}
}