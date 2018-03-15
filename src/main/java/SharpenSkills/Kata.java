package SharpenSkills;

/**
 * For building the encrypted string:
 * Take every 2nd char from the string, then the other chars, that are not every 2nd char, and concat them as new String.
 * Do this n times!
 * <p>
 * Examples:
 * <p>
 * "This is a test!", 1 -> "hsi  etTi sats!"
 * "This is a test!", 2 -> "hsi  etTi sats!" -> "s eT ashi tist!"
 * Write two methods:
 * <p>
 * String encrypt(final String text, final int n)
 * String decrypt(final String encryptedText, final int n)
 * For both methods:
 * If the input-string is null or empty return exactly this value!
 * If n is <= 0 then return the input text.
 * <p>
 * This kata is part of the Simple Encryption Series:
 * Simple Encryption #1 - Alternating Split
 * Simple Encryption #2 - Index-Difference
 * Simple Encryption #3 - Turn The Bits Around
 * Simple Encryption #4 - Qwerty
 * <p>
 * Have fun coding it and please don't forget to vote and rank this kata! :-)
 */
public class Kata {
    public static String encrypt(final String text, int n) {
        if (n <= 0 || text == null || text.isEmpty()) {
            return text;
        }

        StringBuilder firstPart = new StringBuilder();
        StringBuilder secondPart = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char aChar = text.charAt(i);
            if (i % 2 == 1) {
                firstPart.append(aChar);
            } else {
                secondPart.append(aChar);
            }
        }

        return encrypt(firstPart.append(secondPart).toString(), --n);
    }

    public static String decrypt(final String encryptedText, int n) {
        if (n <= 0 || encryptedText == null || encryptedText.isEmpty()) {
            return encryptedText;
        }

        StringBuilder text = new StringBuilder();
        final int half = encryptedText.length() / 2;
        for (int i = 0; i < half; i++) {
            text.append(encryptedText.charAt(half + i)).append(encryptedText.charAt(i));
        }
        if (encryptedText.length() % 2 == 1) {
            text.append(encryptedText.charAt(encryptedText.length() - 1));
        }

        return decrypt(text.toString(), --n);
    }

    public static void main(String[] args) {
        Kata kata = new Kata();
        System.out.println(kata.encrypt("This is a test!", 2));
    }
}
