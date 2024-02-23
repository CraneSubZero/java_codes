public class caesarcipher {

    public static void main(String[] args) {
        

        // Example usage of the Message that you're going to deliver.
        String message = "What do you think of the Avengers Movie?";
        int shiftKey = 3; // The number of times that you're going to shift back to encrypt a message.

        String encryptedMessage = encrypt(message, shiftKey); // This is a function of encrypting the Message.
        String decryptedMessage = decrypt(encryptedMessage, shiftKey); // This is a function of decrypting the Message.

        System.out.println("Original Message: " + message); // The Message that you Encrypted Earlier at Line 7.
        System.out.println("Encrypted Message: " + encryptedMessage); // This is now an Encrypted Message from Line 7.
        System.out.println("Decrypted Message: " + decryptedMessage); // This is now a Decrypted Message from Line 7.
    }

    private static String encrypt(String message, int shiftKey) { // Do the Private User Defined Method (UDM). Also responsible for the Encryption message.
        StringBuilder result = new StringBuilder(); // This will throw back at Line 7.

        for (char character : message.toCharArray()) { // This is a for loop.
            if (Character.isLetter(character)) { // If Else Statement for the Character.
                char base = Character.isLowerCase(character) ? 'a' : 'A'; // This will cross out the Case Sensitive on all letters entered.
                result.append((char) ((character - base + shiftKey) % 26 + base)); // Signifies the 26 Letters on the Alphabet.
            } else {
                result.append(character);
            }
        }

        return result.toString(); // Return back from the String on Line 7.
    }

    private static String decrypt(String encryptedMessage, int shiftKey) { // The Second User Defined Method (UDM). Also responsible for the Decryption of the message.
        // Decryption is the same as encryption with a negative shift
        return encrypt(encryptedMessage, -shiftKey);
    }
}