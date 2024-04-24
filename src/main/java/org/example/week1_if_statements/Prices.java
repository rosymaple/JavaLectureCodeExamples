package org.example.week1_if_statements;

import static input.InputUtils.*;
public class Prices {
    public static void main(String[] args) {
        // productName will be string input from our user...
        String productName = stringInput("What is the name of the product? ");
        // price will be a "double" variable from our user using positiveDoubleInput...
        double price = positiveDoubleInput("What does " + productName + " cost? ");
        // quantitiy will be an int variable from our user using positiveIntInput...
        int quantity = positiveIntInput("How many " + productName + " to sell? ");
        // totalPrice will be a double variable. it will perform an equation for our user.
        double totalPrice = price * quantity;       // multiplies two variables entered by our user.
        // the line below prints a message for our user...
        System.out.println(quantity + " units of " + productName + " at $" + price + " each costs $" + totalPrice);
        // the line below prints a format string for our user...
        System.out.printf("%d of %s at $%.2f each costs $%.2f", quantity, productName, price, totalPrice);
    }       // end of main method
}       // end of public class