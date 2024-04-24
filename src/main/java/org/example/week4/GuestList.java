package org.example.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static input.InputUtils.*;
import static org.example.week4.toDoList.containsIgnoresCase;

public class GuestList {        // start of public class
    public static void main(String[] args) {        // start of main method
    List<String> guestList = new ArrayList<>();     // guestList variable initialized as new String arrayList

        // Collect names and add to guest list

        while (true) {      // start of while loop over 3 conditions.
            // if our user does not click enter, print message below...
        String name = stringInput("Enter name of guest or enter to quit");      // name is user input

        if (name.isEmpty()) {  // if user presses enter, name will be an empty string
            break;      // this will end our program for the user if they click enter
        }       // end of if statement

        if (containsIgnoresCase(guestList, name)) {    // ignore duplicates when adding to guestList arrayList
            System.out.println("You already added " + name);        // print message for user that they are repeating
        } else {        // if-else statement, if the name added is NOT a duplicate value...
            System.out.println("Adding " + name + " to list.");     // print adding the name successfully to guestList
            guestList.add(name);        // finally, add name successfully to guestList
        }       // end of if-else statement
    }       // end of "while (true)" loop

        Collections.sort(guestList); // sort guestList arrayList alphabetically

    printGuestNames(guestList);     // use our printGuestNames method on the guestList variable

    // Remove guests from list if needed

        while (yesNoInput("Do you want to remove any guests?")) {       // initialize while loop using boolean
            // while yesNoInput returns true...
            System.out.println("Here are all the guests"); // print the guestList arrayList elements
            printGuestNames(guestList);     // use printGuestNames method on guestList variable

        // Stop the loop if there are no more guests to remove
        if (guestList.isEmpty()) {      // if our guestList arrayList is empty...
            System.out.println("There are no more guests to remove");   // print message for user
            break;      // if our guestList is empty, print the message above and end program using "break"
        }       // end of if statement

        int index = positiveIntInput("Enter the number of the guest to remove");
        // "index" variable will be user inputted variable...asking for the index of guest to remove from guestList
        index--;   // the guests are printed in a 1-based list, so 1, 2, 3 for three guests.
            // Subtract 1 to get 0-based index
        if (index < guestList.size()) {   // verify index is in range to avoid crash
            String removedGuest = guestList.remove(index);      // initialized removedGuest variable.
            // remove name from guestList arrayList finding it with the index variable.
            System.out.println("Removed guest " + removedGuest);        // prints the removedGuest name for user
        } else {        // print program crashed message
            System.out.println("Error - please enter a valid number of a guest");
        }       // end of if-else block
    }       // end of main method

    printGuestNames(guestList);     // use our printGuestNames method on guestList again

        System.out.println("The number of guests in the guest list is " + guestList.size());
        // print the .size() (how many elements in arrayList) of guestList variable

    selectPrizeWinner(guestList);       // use our selectPrizeWinner method on guestList
}       // end of main method

public static void selectPrizeWinner(List<String> guests) {     // initialize our selectPrizeWinner method
        // our selectPrizeWinner method using guests arrayList as the argument

    if (guests.isEmpty()) {     // if our guests arrayList is empty...
        System.out.println("Warning - no guests - no-one to win the prize");        // print message for our user
        return;     // return this if condition to main method if the guests arrayList is empty.
    }       // end of if statement

    Random rng = new Random();      // random variable initializes as "rng"
    int randomGuestIndex = rng.nextInt(guests.size());
    //sets randomGuestIndex to a random variable from all of guestList's elements

    String prizeWinner = guests.get(randomGuestIndex);      // initialize prizeWinner variable.
    // this is our random number we generated above...

    System.out.println("Guest number " + (randomGuestIndex + 1) + " "
            + prizeWinner + " wins a prize!");      // print message for user showing who won the prize
    // randomGuestIndex + 1 so we don't accidentally print "Guest number + 0"
}       // end of selectPrizeWinner method


public static void printGuestNames(List<String> guests) {       // printGuestNames method using one argument, guests

    System.out.println("Your guest list is: \n");   // print message for user, line break

    if (guests.isEmpty()) {     // if guests arrayList is empty...
        System.out.println("There are no guests in the list.");     // print this message.
    } else {        // else, if guests is NOT empty...
        for (int i = 0; i < guests.size(); i++) {       // loop over the .size() (length) of our arrayList, guests
            System.out.println((i + 1) + ": " + guests.get(i));     // starting at index+1, print each guests element
        }       // end of for loop inside if-else statement
    }       // end of if statement
}       // end of printGuestNames method

public static boolean containsIgnoresCase(List<String> list, String data) {
        // initialize containsIgnoresCase method using 2 arguments, "list" and "data"
    for (String item : list) {      // loop over our variable "list" arrayList
        if (item.equalsIgnoreCase(data)) {      // if an element in "list" contains "data" while ignoring the case!...
            return true;        // return true, the array list does contain item.
        }       // end of if statement asking if "list" contains "item" while ignoring the case used
    }       // end of for loop
    return false;       // return false if data does not equal an item in our list variable
}       // end of boolean method
}       // end of public class GuestList
