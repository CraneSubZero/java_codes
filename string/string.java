import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // A "string" is a data type that represents a sequence of characters.

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        // Assuming age is an int variable, you need to read it from the scanner
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("How many times do you eat in a day?");
        int eat = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("What's the name of your dog/s? ");
        String dogs = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old ");
        System.out.println("You like " + food);
        System.out.println("Oh you eat " + eat + " times a day!");
        System.out.println("Oh, your dog(s) is/are " + dogs + ". They're too cute!");
        // String outputs.
    }
}
