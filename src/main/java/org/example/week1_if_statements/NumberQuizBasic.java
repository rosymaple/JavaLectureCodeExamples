package org.example.week1_if_statements;

import static input.InputUtils.intInput;

public class NumberQuizBasic {
    public static void main(String[] args) {

        int secretNumber = 6;       // this will initialize our secretNumber variable...
        // which will be our answer for this riddle.
        int guess = intInput("Guess the number I am thinking of");
        // "guess" will ask for an int input from our user.
        if (guess == secretNumber) {        // if guess equals our secretNumber variable which is 6...
            System.out.println("You guessed correctly!");       // prints positive message for user
        }       // if guess is not 6, nothing will print and the program will end.
    }       // end of main method
}       // end of public class
