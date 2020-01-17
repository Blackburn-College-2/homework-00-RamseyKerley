/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramseykhw0;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ramsey.kerley
 */
public class RamseyKHw0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[] choices = new String[3];

        choices[0] = "sushi";
        choices[1] = "shrimp";
        choices[2] = "taco";

        boolean guessing = true;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int pointInArray = rand.nextInt(3);
        System.out.println(pointInArray);
        int[] guesses = new int[3];

        System.out.println("The secret meal must be one of the following");
        System.out.println(choices[0]);
        System.out.println(choices[1]);
        System.out.println(choices[2]);
        int i = 0;
        while (guessing) {
            i++;
            System.out.print("Guess the secret meal: ");
            String guess = input.next();
            if (!checkIfValid(guess.toLowerCase(), choices)) {

                guessing = false;
            }

            for (int j = 0; j < guesses.length; j++) {
                guessing = guessing && checkGuess(guess, choices, guesses, j);

            }

            if (guessing) {

                if (guess.toLowerCase().equals(choices[pointInArray])) {
                    System.out.println("you win");
                    guessing = false;
                } else if (!guess.toLowerCase().equals(choices[pointInArray])) {
                    System.out.println("Wrong");
                }
            } else {
                System.out.println("you lose hahahahahhahahhaha");
            }
        }

    }

    public static boolean checkGuess(String guess, String[] choices, int[] guesses, int index) {
        if (guess.toLowerCase().equals(choices[index])) {
            if (guesses[index] > 0) {
                return false;
            } else {
                guesses[index]++;
                return true;
            }
        }
        return true;
    }

    public static boolean checkIfValid(String guess, String[] choices) {
        boolean valid = false;
        for (int i = 0; i < choices.length; i++) {
            if (guess.equals(choices[i])) {
                valid = true;
            }
        }
        return valid;
    }

}
