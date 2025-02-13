import java.util.Scanner;

public class Valentines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("     ***       ***     ");
        System.out.println("   *******   *******   ");
        System.out.println("  ********* *********  ");
        System.out.println("   *****************   ");
        System.out.println("    ***************    ");
        System.out.println("      ***********      ");
        System.out.println("        *******        ");
        System.out.println("          ***          ");
        System.out.println("           *           ");
        System.out.println();
        System.out.println("Will you be my Valentine? <3 (yes/no)\n");

        String response = scanner.nextLine().trim().toLowerCase();

        if (response.equals("yes")) {
            System.out.println("\nYay! te date nata ha! <3");
        } else if (response.equals("no")) {
            System.out.println("\nIt really hurtz. </3");
        } else {
            System.out.println("Hmm, I didn't quite get that. But Happy Valentine's Day anyway! 🌹");
        }

        scanner.close();
    }
}