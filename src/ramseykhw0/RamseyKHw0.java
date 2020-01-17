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
        // System.out.print(pointInArray);

        while (guessing) {
            System.out.println("The secret meal must be one of the following");
            System.out.println(choices[0]);
            System.out.println(choices[1]);
            System.out.println(choices[2]);
            System.out.print("Guess the secret meal: ");
            String guess = input.next();
            System.out.println();
        }

    }

}
