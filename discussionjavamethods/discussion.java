import java.util.Scanner;

public class discussion {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your full name: ");
            String fullName = scan.nextLine();

            int firstSpaceIndex = fullName.indexOf(" "); // For the First Name
            int secondSpaceIndex = fullName.indexOf(" ", firstSpaceIndex + 1); // Must Find the index of the second name
            int thirdSpaceIndex = fullName.indexOf(" ", secondSpaceIndex + 1); // Must Find the index of the third name

            String firstName = fullName.substring(0, firstSpaceIndex); // here is for the first name
            String secondName = fullName.substring(firstSpaceIndex + 1, secondSpaceIndex); // here is for the second name
            String middleName = fullName.substring(secondSpaceIndex + 1, thirdSpaceIndex); // here is for the middle name
            String lastName = fullName.substring(thirdSpaceIndex + 1); // here is for the last name

            System.out.println("First name: " + firstName);
            System.out.println("Second name: " + secondName);
            System.out.println("Middle name: " + middleName);
            System.out.println("Last name: " + lastName);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid input format. Please enter your full name in the correct format.");
        }
    }
}