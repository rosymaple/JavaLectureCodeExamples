package org.example.week2;

import java.util.Random;
import static input.InputUtils.intInput;
public class GuessTheNumber {
    public static void main(String[] args) {

        Random random = new Random();       // initialize random variable using the random library...
        int secretNumber = random.nextInt(100) + 1;     // secretNumber will use our random function
            // nextInt(100) will sent the random parameter from 0-100, plus 1 because we want to count from 1 here.
        int guess = intInput("Guess the number");       // variable "guess" will be found using intInput()
        // we want to give the user as many chances as they need to guess the "secretNumber" random variable...
        while (guess != secretNumber) {     // while the intInput "guess" is NOT equal to the secretNumber...
            System.out.println("That's wrong, try again!");     // print negative message for the user

            if (guess < secretNumber) {     // if guess is less than the secretNumber
                System.out.println("That's wrong, try again!");     // print wrong number message
            }       // end of if statement

            if (guess > secretNumber) {     // if guess is greater than secretNumber
                System.out.println("Guess lower!");     // print a "Guess lower number" message for the user
            }       // end of if statement asking if guess is greater than secretNumber

            guess = intInput("Guess the number");       // ask the user again to guess the number
        }       // while statement for while guess is NOT equal to secret number ends here.
        // if the guess IS equal to secretNumber, then the message below will print for the user...
        System.out.println("Correct!");         // the user has guessed the correct number.
    }       // end of main method
}       // end of public class
