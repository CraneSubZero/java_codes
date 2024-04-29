import java.util.Scanner;
import java.util.Arrays; // Always Indicate the import arrays

public class StringSearchArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = new String[10];

        // We are going to prompt the user here for the values by using the For loop by integrating it to the scanner
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            stringArray[i] = scanner.nextLine();
        }

        // You're going to type here the "string" or "value" that you wanted to input
        System.out.print("\nEnter a string to search in the array:");
        String searchValue = scanner.nextLine();

        // This is responsible for searching the array that you have written on line 16
        boolean valueFound = Arrays.asList(stringArray).contains(searchValue);

        // Result of the written input that you put on line 16
        if (valueFound) {
            int index = Arrays.asList(stringArray).indexOf(searchValue);
            System.out.println("\nValue found at index: " + index);
        } else {
            System.out.println("Value not found.");
        }

        scanner.close();
    }
}