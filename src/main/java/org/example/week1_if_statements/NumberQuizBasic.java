package org.example.week1_if_statements;

import static input.InputUtils.intInput;

public class NumberQuizBasic {
    public static void main(String[] args) {

        int secretNumber = 6;

        int guess = intInput("Guess the number I am thinking of");

        if (guess == secretNumber) {
            System.out.println("You guessed correctly!");
        }




    }


}
