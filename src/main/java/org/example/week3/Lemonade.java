package org.example.week3;

import static input.InputUtils.doubleInput;

import static input.InputUtils.intInput;
public class Lemonade {
    public static void main(String[] args) {        // start of main method
        // lemonadeProfit below will be calculated by the method calculateProfitForProduct...
        double lemonadeProfit = calculateProfitForProduct("lemonade");      //calls the double method
        System.out.println("Lemonade profit = $" + lemonadeProfit); // prints a message of lemonadeProfit for our user
        // cookieProfit below will be calculated by calculateProfitForProduct...
        double cookieProfit = calculateProfitForProduct("cookie");     // calls the double method
        System.out.println("Cookie profit = $" + cookieProfit);     // print cookieProfit for the user
        // coffeeProfit will be calculated by calculateProfitForProduct...
        double coffeeProfit = calculateProfitForProduct("coffee");      // calls the double method
        System.out.println("Coffee profit = $" + coffeeProfit);     // print coffeeProfit in this line
    }       // end of public static method

    public static double calculateProfitForProduct(String productName) {        // double method to calculate profit
        System.out.println("How much did you spend on " + productName + " supplies?" );
        double suppliesCost = doubleInput();        // ask user for productName supply cost
        System.out.println("What did you sell one " + productName + " for? ");
        double salePrice = doubleInput();       // ask user for productName cost
        System.out.println("How many " + productName + " did you sell?");
        int numberSold = intInput();        // ask user for numberSold of productName
        // Calculate profit variable below
        double profit = ( numberSold * salePrice ) - suppliesCost;      // profit is a calculation from input variables.
        return profit;      // return profit to main method
    }       // public static double method returns to main
}       // end of public class
