import java.util.Scanner;

public class SentenceAnalyzer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();

        sentence = sentence.toLowerCase();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char character = sentence.charAt(i);

            if (isVowel(character)) {
                vowels++;
            } else if (isConsonant(character)) {
                consonants++;
            } else if (isDigit(character)) {
                digits++;
            }
        }

        System.out.println(vowels + " vowels");
        System.out.println(consonants + " consonants");
        System.out.println(digits + " digits");

        scan.close();
    }

    public static boolean isVowel(char character) {
        return character == 'a'
                || character == 'e'
                || character == 'i'
                || character == 'o'
                || character == 'u';
    }

    public static boolean isConsonant(char character) {
        boolean isLetter =
                character >= 'a' && character <= 'z';

        return isLetter && !isVowel(character);
    }

    public static boolean isDigit(char character) {
        return character >= '0' && character <= '9';
    }
}