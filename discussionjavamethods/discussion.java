import java.util.Scanner;

public class discussion {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your full name: ");
    String fullName = scan.nextLine();

    int firstSpaceIndex = fullName.indexOf(" ");
    int secondSpaceIndex = fullName.indexOf(" ", firstSpaceIndex + 1); // Find the index of the second space

    String firstName = fullName.substring(0, firstSpaceIndex);
    String secondName = fullName.substring(firstSpaceIndex + 1, secondSpaceIndex); // Extract the second name
    String lastName = fullName.substring(secondSpaceIndex + 1);

    System.out.println("First name: " + firstName);
    System.out.println("Second name: " + secondName);
    System.out.println("Last name: " + lastName);
  }
}