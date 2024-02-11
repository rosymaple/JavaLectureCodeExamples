package org.example.week1_if_statements;

import static input.InputUtils.*;
public class Prices {
    public static void main(String[] args) {
        String productName = stringInput("What is the name of the product? ");
        double price = positiveDoubleInput("What does " + productName + " cost? ");
        int quantity = positiveIntInput("How many " + productName + " to sell? ");

        double totalPrice = price * quantity;

        System.out.println(quantity + " units of " + productName + " at $" + price + " each costs $" + totalPrice);

        System.out.printf("%d of %s at $%.2f each costs $%.2f", quantity, productName, price, totalPrice);

    }
}