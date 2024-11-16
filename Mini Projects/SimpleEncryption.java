/* 10) Simple Encryption Program
Description: A program that encrypts and decrypts text using a basic encryption algorithm, such as Caesar Cipher, for simple text encoding.

Features:

Encrypt text with a shift-based algorithm.
Decrypt encoded text back to the original.*/

import java.util.Scanner;

public class SimpleEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to encrypt: ");
        String text = scanner.nextLine();

        System.out.print("Enter shift value (1-25): ");
        int shift = scanner.nextInt();

        String encryptedText = encrypt(text, shift);
        System.out.println("Encrypted Text: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decrypted Text: " + decryptedText);

        scanner.close();
    }

    public static String encrypt(String text, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char shiftedChar = (char) (c + shift);
                if ((Character.isLowerCase(c) && shiftedChar > 'z') || (Character.isUpperCase(c) && shiftedChar > 'Z')) {
                    shiftedChar -= 26;
                }
                encrypted.append(shiftedChar);
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, -shift);
    }
}
