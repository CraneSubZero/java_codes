public class dowhile {

public static void main(String[] args) {

		int a = 1; // This is the Beginning of an Odd integer input.
		do {
			if ( a%2 != 0 ); // This is an MODULO Integer - display it!
			System.out.println(a); // This is where the Output will appear in the Terminus.
			a+= 2; // This is an indicator to guarantee the +2 per Odd Number which is a self-explanatory of 1+2 = 3 Rule.
		}
		while ( a <= 39 ); // The ending Odd Integer.
	}
}

