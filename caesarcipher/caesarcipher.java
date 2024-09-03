import java.util.Scanner;

public class caesarcipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialize the scanner to read user input

        // Prompt the user for the message they want to encrypt
        System.out.print("Enter the message to encrypt: ");
        String message = scanner.nextLine();

        // Prompt the user for the shift key
        System.out.print("Enter the shift key (number of positions to shift): ");
        int shiftKey = scanner.nextInt();

        // Perform encryption and decryption
        String encryptedMessage = encrypt(message, shiftKey); // Encrypt the message
        String decryptedMessage = decrypt(encryptedMessage, shiftKey); // Decrypt the message

        // Output the results
        System.out.println("Original Message: " + message);
        System.out.println("Encrypted Message: " + encryptedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);

        scanner.close(); // Close the scanner to avoid resource leaks
    }

    private static String encrypt(String message, int shiftKey) { 
        StringBuilder result = new StringBuilder(); 

        for (char character : message.toCharArray()) { 
            if (Character.isLetter(character)) { 
                char base = Character.isLowerCase(character) ? 'a' : 'A'; 
                result.append((char) ((character - base + shiftKey) % 26 + base)); 
            } else {
                result.append(character);
            }
        }

        return result.toString(); 
    }

    private static String decrypt(String encryptedMessage, int shiftKey) { 
        return encrypt(encryptedMessage, -shiftKey); // Decrypt using the reverse shift
    }
}