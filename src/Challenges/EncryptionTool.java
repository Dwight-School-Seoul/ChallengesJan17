package Challenges;

import java.util.Scanner;
import Main.*;

public class EncryptionTool {

    public static void main(){
        Scanner scan = new Scanner(System.in);

        while (true){

        System.out.print("\n > Enter a message to encrypt: ");
        String message = While.getStringScanOnly(scan);

        System.out.print("\n > Enter a key (integer value) for encryption: ");
        int key = While.getIntegerScanOnly(scan);

        String encryptedMessage = encrypt(message, key);
        System.out.print("\n > Encrypted message: " + encryptedMessage);

        String decryptedMessage = decrypt(encryptedMessage, key);
        System.out.print("\n > Decrypted message: " + decryptedMessage);

        While.again();
    }

}

    public static String encrypt(String message, int key) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                char shiftedCharacter = (char) (((character - 'a' + key) % 26) + 'a');
                result.append(shiftedCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public static String decrypt(String message, int key) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                char shiftedCharacter = (char) (((character - 'a' - key + 26) % 26) + 'a');
                result.append(shiftedCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

}
