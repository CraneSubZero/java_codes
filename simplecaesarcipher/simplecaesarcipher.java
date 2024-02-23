import java.util.Scanner;

public class simplecaesarcipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the shift value from the user
        System.out.print("Enter the shift value: ");
        int shift = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Get the plain text from the user
        System.out.print("Enter the plain text: ");
        String plaintext = scanner.nextLine();

        // Encrypt the plain text using the Caesar Cipher
        String ciphertext = caesarCipherEncrypt(plaintext, shift);

        // Output the ciphertext
        System.out.println("Ciphertext: " + ciphertext);

        scanner.close();
    }

    // Method to perform Caesar Cipher encryption
    private static String caesarCipherEncrypt(String plaintext, int shift) {
        // Implement the encryption logic here
        // ...

        return encryptedText;
    }
}