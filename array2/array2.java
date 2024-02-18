import java.util.Scanner;

public class array2 {

    public static void main(String[] args) {
        // array = used to store multiple values within a single variable

        Scanner scanner = new Scanner(System.in);

        String[] games = new String[3]; // Instead of using Int, will be using String for that the Display will be the Game Names only.

        for (int i = 0; i < games.length; i++) {
            System.out.print("Enter game name for index " + i + ": ");
            games[i] = scanner.nextLine();
        }

        System.out.println("List of games:");

        for (int i = 0; i < games.length; i++) { // Always use the increment on a for loop which is (i++).
            System.out.println(games[i]); // Put the (i) beside the String which is called "games."
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
