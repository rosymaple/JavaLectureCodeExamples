package org.example.week2;

import static input.InputUtils.doubleInput;
import static input.InputUtils.yesNoInput;
public class whileLoops {
    public static void main(String[] args) {
        boolean moreCalculations = true;    // this variable will always remain true until user inputs No.
        double price;           // initialize double variable
        double salesTax = 1.07;     // initialize salesTax variable

        while (moreCalculations) {      // if moreCalculations is true
            price = doubleInput("Type in a price");     // price = double variable, ask user for the price.
            double priceInclTax = price * salesTax;     // priceInclTax is a calculation.
            System.out.println("The price plus sales tax is " + priceInclTax);      // print calculation message.

            // keep asking the user inside the loop if moreCalculations is still true.
            moreCalculations = yesNoInput("Do you want to continue?");      // asks user a question.
        }       // end of while loop for moreCalculations program.
        System.out.println("Thanks for using the program - goodbye!");  // end of program goodbye message
    }  // end of main method
}       // end of public class whileLoops