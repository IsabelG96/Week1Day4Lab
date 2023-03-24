package org.example;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {
    public static void main(String[] args) {
//        To generate the secret number
        int SecretNumber = ThreadLocalRandom.current().nextInt(1,11);
        System.out.println("I am thinking of a number between 1 and 10. What is it?");
//       Prompts the user to pick a number
        Scanner reader = new Scanner(System.in); //creates scanner object
        int UserGuess = reader.nextInt();

//        Tells user if they were right or wrong
        if (UserGuess == SecretNumber) {
            System.out.println("Correct!");
        } else if (UserGuess < SecretNumber) {
            System.out.println("Too low! Better luck next time!");
        } else if (UserGuess > SecretNumber) {
            System.out.println("Too high! Better luck next time!");
        }
    }
}
