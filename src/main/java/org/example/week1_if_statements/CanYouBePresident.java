package org.example.week1_if_statements;

import static input.InputUtils.positiveIntInput;
import static input.InputUtils.yesNoInput;
public class CanYouBePresident {
    public static void main(String[] args) {

        System.out.println("Are you eligible to become President of the US?");      //prints message
        System.out.println("Please answer these three questions.");     //prints message

        boolean naturalBornCitizen = yesNoInput("Were you born in the US?");        // boolean variable
        // yesNoInput is needed to ask for a boolean true/false variable
        int age = positiveIntInput("What is your age, in years?");
        // our age variable needs to be a positiveInt input
        int yearsLivedInUSA = positiveIntInput("How many years have you lived in the United States? ");
        // our yearsLivedInUSA variable needs to be a positiveInt number
            if (naturalBornCitizen && age >= 35 && yearsLivedInUSA >= 14) {     // if ALL three conditions are met
                System.out.println("You meet the eligibility requirements.");       // print positive message for user
            } else {        // else if all three conditions are NOT met...
            System.out.println("You do not meet the eligibility requirements.");    // print negative message for user
        }       // end of if-else statement
    }       // end of public main method
}       // end of public class
