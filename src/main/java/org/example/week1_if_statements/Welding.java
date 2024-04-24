package org.example.week1_if_statements;

import static input.InputUtils.yesNoInput;

public class Welding {
    public static void main(String[] args) {

        // we need to ask for three boolean variables below using yesNoInput...
        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?");
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?");
        boolean closedToeShoes = yesNoInput("Are you wearing closed-toe shoes?");

        // TODO - write an if-statement to check if the student is dressed safely

        if (    (cottonClothes || woolClothes) && closedToeShoes) {
            // if EITHER conditions are true, AND closedToeShoes is true...
            System.out.println("You are dressed safely for welding class.");        // print positive message for user
        } else {        // if-else statement, else...
            System.out.println("You are not dressed for welding class.");       //print negative message for user
        }       // end of if-else block
    }       // end of public main method
}       // end of public class Welding
