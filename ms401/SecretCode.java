import java.util.Scanner;

public class SecretCode {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String[] PRIME_FACTORS = {
        "0", "1", "2", "3", "2^2", "5", "2*3", "7", "2^3", "3^2", "2*5", "11", "2^2*3", "13", "2*7", "3*5", "2^4", "17", "2*3^2", "19", "2^2*5",
        "3*7", "2*11", "23", "2^3*3", "5^2", "2*13"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter plaintext: ");
        String plaintext = scanner.nextLine().toUpperCase().replaceAll("\\s", "");
        String encodedText = encode(plaintext);
        System.out.println("Encoded Text: " + encodedText);
    }

    private static String encode(String plaintext) {
        StringBuilder encodedText = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i++) {
            int index = ALPHABET.indexOf(plaintext.charAt(i));
            if (index != -1) {
                encodedText.append(PRIME_FACTORS[index]).append(" ");
            } else {
                encodedText.append(plaintext.charAt(i)).append(" ");
            }
        }
        return encodedText.toString().trim();
    }
}