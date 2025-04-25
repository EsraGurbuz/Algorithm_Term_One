
/***********************************************************************
@Title:	    GurbuzEsraFindTheNumber.java
@Purpose:	To get familiar with loops and conditional statements
@Author:    Gurbuz Esra
@Date:   	11.28.2024 28th of November 2024
@Version:	1.0
************************************************************************/


import java.util.Scanner;
import java.util.Random;

public class GurbuzEsraFindTheNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        int[] secretCode = new int[4];
        for (int i = 0; i < 4; i++) {
            boolean isUnique;
            do {
                secretCode[i] = random.nextInt(6) + 1;
                isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (secretCode[i] == secretCode[j]) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
        }

        System.out.println("Guess the secret code: ");
        System.out.println("I have two rules: ");
        System.out.println("1. Every digit is between 1 and 6.");
        System.out.println("2. You have 10 attempts.");

        for (int attempts = 1; attempts <= 10; attempts++) {
            System.out.print("Attempt " + attempts + " : ");
            int guess = keyboard.nextInt();

            int[] guessArray = new int[4];
            for (int i = 3; i >= 0; i--) {
                guessArray[i] = guess % 10;
                guess /= 10;
            }

            char[] feedback = { ' ', ' ', ' ', ' ' };
            boolean[] codeUsed = new boolean[4];
            boolean[] guessUsed = new boolean[4];

            for (int i = 0; i < 4; i++) {
                if (guessArray[i] == secretCode[i]) {
                    feedback[i] = '+';
                    codeUsed[i] = true;
                    guessUsed[i] = true;
                }
            }

            for (int i = 0; i < 4; i++) {
                if (guessUsed[i]) continue;
                for (int j = 0; j < 4; j++) {
                    if (!codeUsed[j] && guessArray[i] == secretCode[j]) {
                        feedback[i] = '-';
                        codeUsed[j] = true;
                        break;
                    }
                }
            }

            System.out.println("Feedback:   " + new String(feedback));

            if (new String(feedback).equals("++++")) {
                System.out.println("Congratulations! You guessed the secret code.");
                return;
            }
        }

        System.out.print("Game Over! The secret code was: ");
        for (int real : secretCode) {
            System.out.print(real);
        }
        System.out.println();
    }
}
