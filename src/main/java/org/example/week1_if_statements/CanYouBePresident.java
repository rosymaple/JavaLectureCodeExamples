package org.example.week1_if_statements;

import static input.InputUtils.positiveIntInput;
import static input.InputUtils.yesNoInput;
public class CanYouBePresident {
    public static void main(String[] args) {

        System.out.println("Are you eligible to become President of the US?");
        System.out.println("Please answer these three questions.");

        boolean naturalBornCitizen = yesNoInput("Were you born in the US?");
        int age = positiveIntInput("What is your age, in years?");
        int yearsLivedInUSA = positiveIntInput("How many years have you lived in the United States? ");

        if (naturalBornCitizen && age >= 35 && yearsLivedInUSA >= 14) {
            System.out.println("You meet the eligibility requirements.");
        } else {
            System.out.println("You do not meet the eligibility requirements.");
        }
    }
}
