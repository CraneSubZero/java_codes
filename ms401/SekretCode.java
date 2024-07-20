import java.util.Scanner;

public class SekretCode {
    // Constant string representing the alphabet
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    // Array of prime factors for indices 0 through 25
    private static final String[] PRIME_FACTORS = {
        "1", "2", "3", "2^2", "5", "2*3", "7", "2^3", "3^2", "2*5", "11", "2^2*3", "13", "2*7", "3*5", "2^4", "17", "2*3^2", "19", "2^2*5",
        "3*7", "2*11", "23", "2^3*3", "5^2", "2*13"
    };

    public static void main(String[] args) {
        // Create a scanner to read the input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter raw txt
        System.out.print("Enter a Raw Text: ");
        
        // Read the input, convert to uppercase, and remove all whitespace characters
        String plaintext = scanner.nextLine().toUpperCase().replaceAll("\\s", "");
        
        // Encode the raw text using the encode method
        String encodedText = encode(plaintext);
        
        // Print the encoded text
        System.out.println("Encoded Text: " + encodedText);
    }

    // Method to encode the plaintext
    private static String encode(String plaintext) {
        // StringBuilder to construct the encoded text
        StringBuilder encodedText = new StringBuilder();
        
        // Loop through each character of the plaintext
        for (int i = 0; i < plaintext.length(); i++) {
            // Find the index of the current character in the ALPHABET string
            int index = ALPHABET.indexOf(plaintext.charAt(i));
            
            // If the character is found in the ALPHABET string
            if (index != -1) {
                // Append the corresponding prime factor followed by a space
                encodedText.append(PRIME_FACTORS[index]).append(" ");
            } else {
                // If the character is not a letter, we shall assume it as it is followed by a space through an "append" rule.
                encodedText.append(plaintext.charAt(i)).append(" ");
            }
        }
        
       // Transform the StringBuilder into a string and eliminate any trailing spaces
        return encodedText.toString().trim();
    }
}