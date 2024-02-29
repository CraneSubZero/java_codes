import java.util.Scanner;

public class simplecaesarcipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the shift value from the user
        int shift;
        while (true) {
            try {
                System.out.print("Enter the shift value: ");
                String shiftInput = scanner.nextLine();
                shift = Integer.parseInt(shiftInput);
                break; // Break out of the loop if the input is a valid integer
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        // Get the plain text from the user
        System.out.print("Enter the text: ");
        String inputText = scanner.nextLine();

        // Encrypt the plain text using the Caesar Cipher
        String encryptedText = caesarCipherEncrypt(inputText, shift);
        System.out.println("Encrypted text: " + encryptedText);

        // Decrypt the cipher text using the Caesar Cipher
        String decryptedText = caesarCipherDecrypt(encryptedText, shift);
        System.out.println("Decrypted text: " + decryptedText);

        scanner.close();
    }

    // Method to perform Caesar Cipher encryption
    private static String caesarCipherEncrypt(String plaintext, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char currentChar = plaintext.charAt(i);

            if (Character.isLetter(currentChar)) {
                char base = Character.isUpperCase(currentChar) ? 'A' : 'a';
                // Shift the letters (both uppercase and lowercase) by the specified amount
                char encryptedChar = (char) (((currentChar - base + shift) % 26 + 26) % 26 + base);
                encryptedText.append(encryptedChar);
            } else {
                // If the character is not a letter, leave it unchanged
                encryptedText.append(currentChar);
            }
        }

        return encryptedText.toString();
    }

    // Method to perform Caesar Cipher decryption
    private static String caesarCipherDecrypt(String ciphertext, int shift) {
        // Decryption is just the encryption in reverse, so we use a negative shift
        return caesarCipherEncrypt(ciphertext, -shift);
    }
}