import java.util.Scanner;
import java.util.Random;

public class GussingGame {

    private Scanner scan;
    private char response;
    private int secretNumber;

    private int gamesWon = 0;
    private int gamesLost = 0;

    // 常量
    private static final int MAX_GUESSES = 6;
    private static final int LOWER_BOUND = 0;
    private static final int UPPER_BOUND = 100;

    // 程序入口
    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing Game!");

        GussingGame hiLo = new GussingGame();
        hiLo.start();
    }

    // 控制整个游戏
    private void start() {
        scan = new Scanner(System.in);

        display();

        System.out.print("Do you want to play a game (y/n)? ");
        response = scan.next().toLowerCase().charAt(0);

        while (response == 'y') {
            generateSecretNumber();

            boolean won = playGame();

            if (won) {
                gamesWon++;
            } else {
                gamesLost++;
                System.out.println(
                        "You did not guess the number."
                );
                System.out.println(
                        "The secret number was " + secretNumber
                );
            }

            System.out.print(
                    "\nDo you want to play again (y/n)? "
            );
            response = scan.next().toLowerCase().charAt(0);
        }

        System.out.println("\nGoodBye");
        System.out.println("Games won: " + gamesWon);
        System.out.println("Games lost: " + gamesLost);

        scan.close();
    }

    // 显示游戏规则
    private void display() {
        System.out.println(
                "You have " + MAX_GUESSES + " guesses."
        );
        System.out.println(
                "The number is between "
                        + LOWER_BOUND + " and " + UPPER_BOUND + "."
        );
    }

    // 生成秘密数字
    private void generateSecretNumber() {
        Random random = new Random();

        secretNumber = random.nextInt(
                UPPER_BOUND - LOWER_BOUND + 1
        ) + LOWER_BOUND;
    }

    private boolean playGame() {
        for (int attempt = 1;
             attempt <= MAX_GUESSES;
             attempt++) {

            System.out.println(
                    "\nGuess " + attempt
                            + " of " + MAX_GUESSES
            );

            int guess = readGuess();

            if (guess == secretNumber) {
                System.out.println("Correct! You won!");
                return true;
            } else if (guess > secretNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            }
        }

        return false;
    }

    private int readGuess() {
        while (true) {
            System.out.print(
                    "Enter a whole number between "
                            + LOWER_BOUND + " and "
                            + UPPER_BOUND + ": "
            );

            if (!scan.hasNextInt()) {
                System.out.println(
                        "That is not a whole number."
                );
                scan.next();
                continue;
            }

            int guess = scan.nextInt();

            if (guess < LOWER_BOUND ||
                    guess > UPPER_BOUND) {

                System.out.println(
                        "The number must be between "
                                + LOWER_BOUND + " and "
                                + UPPER_BOUND + "."
                );
                continue;
            }

            return guess;
        }
    }
}