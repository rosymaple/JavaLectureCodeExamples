package org.example.week2;

import java.text.NumberFormat;

import static input.InputUtils.doubleInput;
import static input.InputUtils.yesNoInput;

public class whileLoops2 {
    public static void main(String[] args) {        // another whileLoops program, main method starts here
        boolean moreCalculations = true;        // we will ask the user if they want to continue program using this.
        double price;       // initialize the price variable here
        double salesTax = 1.07;     // initialize salesTax variable which is 7 percent

        while(moreCalculations) {       // "while" moreCalculations is a true boolean statement, run this code...

            price = doubleInput("Type in a price");     // ask the user for double variable input
            double priceInclTax = price * salesTax;             // priceInclTax is price multiplied by sales tax

            // our NumberFormat object below. formats numbers for us. getCurrencyInstance() will get my currency;
            // and will format it to display correctly.
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
            String formattedPrice = currencyFormatter.format(priceInclTax);
            // formattedPrice uses currencyFormatter.format() to print our price with proper American formatting
            System.out.println("The price plus sales tax is " + formattedPrice);    //print message for user
            moreCalculations = yesNoInput("Do you want to continue?");      // ask user if true or false.
        }       // end of while loop
    }       // end of main method
}       // end of public class whileLoops2
