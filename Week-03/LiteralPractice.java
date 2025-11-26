
public class LiteralPractice {
    public static void main(String[] args) {
        // Long literal (requires 'L' suffix)
        long bigNumber = 1234567890123L;

        // Float literal (requires 'f' suffix)
        float piApprox = 3.14159f;

        // Char literal using Unicode escape (© symbol is U+00A9)
        char copyrightSymbol = '\u00A9';

        // Print values
        System.out.println("Long literal value: " + bigNumber);
        System.out.println("Float literal value: " + piApprox);
        System.out.println("Char literal value: " + copyrightSymbol);
    }
}
