import java.util.Scanner;

public class discussion {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your full name: ");
    String fullName = scan.nextLine();

    int firstSpaceIndex = fullName.indexOf(" "); // For the First Name
    int secondSpaceIndex = fullName.indexOf(" ", firstSpaceIndex + 1); // Must Find the index of the second name

    String firstName = fullName.substring(0, firstSpaceIndex); // here is for the first name
    String secondName = fullName.substring(firstSpaceIndex + 1, secondSpaceIndex); // here is for the second name
    String lastName = fullName.substring(secondSpaceIndex + 1); // here is for the last name

    System.out.println("First name: " + firstName);
    System.out.println("Second name: " + secondName);
    System.out.println("Last name: " + lastName);
  }
}