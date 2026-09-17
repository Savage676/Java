
import java.util.Scanner;

public class StringAnalyzer {

    // 保存 a 到 z
    private char[] letters = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g',
            'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u',
            'v', 'w', 'x', 'y', 'z'
    };

    private int[] frequency = new int[26];

    private String inputString;

    public static void main(String[] args) {
        StringAnalyzer myAnalyzer = new StringAnalyzer();

        myAnalyzer.start();
    }

    private void start() {
        this.getString();
        this.analyzeString();
        this.reportAnalysis();

        System.out.println("Program Terminating, Goodbye");
    }

    private void getString() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        inputString = scan.nextLine();
    }

    private void analyzeString() {
        inputString = inputString.toLowerCase();

        for (int i = 0; i < inputString.length(); i++) {
            char currentCharacter = inputString.charAt(i);

            if (currentCharacter >= 'a'
                    && currentCharacter <= 'z') {

                int index = currentCharacter - 'a';
                frequency[index]++;
            }
        }
    }

    // 输出所有出现过的字母及次数
    private void reportAnalysis() {
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(
                        "Character " + letters[i]
                                + " occurs "
                                + frequency[i]
                                + " times"
                );
            }
        }
    }

}