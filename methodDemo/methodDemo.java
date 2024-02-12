public class methodDemo {

	public static void main(String[] args) {

		int a,b;

		a = 9;
		b = 6;

		System.out.println("Minimum Value is: " + minFunc(a,b));

	}

	public static int minFunc(int a, int b) {

		int min;

		if ( a > b )
			min = b;
		else
			min = a;

		return min;
	}
}