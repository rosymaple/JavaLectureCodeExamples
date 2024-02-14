package org.example.week1_if_statements;

import static input.InputUtils.yesNoInput;

public class Welding {
    public static void main(String[] args) {

        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?");
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?");
        boolean closedToeShoes = yesNoInput("Are you wearing closed-toe shoes?");

        // TODO - write an if-statement to check if the student is dressed safely

        if (    (cottonClothes || woolClothes) && closedToeShoes) {
            System.out.println("You are dressed safely for welding class.");
        } else {
            System.out.println("You are not dressed for welding class.");
        }
    }
}
