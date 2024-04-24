package org.example.week3;

import static input.InputUtils.*;

public class Tires {
    public static void main(String[] args) {        // calling main method

        int numberOfTiresToCompare = positiveIntInput("Enter number of tires to repair: "); // the user input
        String[] tireReports = new String[numberOfTiresToCompare];      // create an array based off of user input
        for (int t = 0; t < numberOfTiresToCompare; t++) {      // loop over user input
            String report = getTireInfo();      // calls the getTireInfo method to return here
//            System.out.println(report);
            tireReports[t] = report;        // declares the calculations under "getTireInfo" and saves as "report"
        }
        printReportTable(tireReports);      // call printReportTable method on variable tireReports
    }       // end of main method

    private static void printReportTable(String[] tireReports) {        // printReportTable method, 1 argument is array
        for (int t = 0; t < tireReports.length ; t++) {     // for loop over the length of tireReports array
        System.out.println(tireReports[t]);     // print each element from tireReports until length of array has ended
        }       // end of for loop over tireReports
    }       // end of printReportTable method
    public static String getTireInfo() {        // getTireInfo method
        String tireName = stringInput("Enter name of tire ");       // tireName string input from user
        double price = doubleInput("Enter price for " + tireName);      // price is a double input from user
        double miles = doubleInput("Enter warranty miles for " + tireName);     // miles is a double input
        double pricePerThousandMiles = price / miles * 1000;        // this variable performs a calculation
        return "The " + tireName + " tire costs $" + pricePerThousandMiles + " dollars per thousand miles";
        // returns a message with user input variable and a variable that performs a calculation to the main method
    }       // end of getTireInfo method
}       // end of public class
