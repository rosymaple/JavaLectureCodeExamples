package org.example.week1_if_statements;

import static input.InputUtils.stringInput;

public class ScopeExamples_main {
    public static void main(String[] args) {

        //Bookstore has a 10% student discount
        //System.out.println(email); // error - can't use variable before created
        String email = stringInput("Enter your email");     // asks user for email using stringInput()

        double bookPrice = 40;      // our bookPrice variable needs to be a double. bookPrice is 40.

        double discount = 0;        // initializes our discount variable. we will use 0 as our starting point.

        if (email.endsWith(".edu")) {       // if the user enters an email that endsWith() an ".edu" string...
            System.out.println("Your student email is " + email);       // print that it IS a student email...
            discount = 10; // 10% student discount      // initialize our student discount which is "10"
        }

        System.out.println(email);      // prints our "email" stringInput variable.
        //Calculate final price with any discounts. bookPrice will be an equation using our discount variable.
        bookPrice = bookPrice / 100 * (100 - discount);     // bookPrice will take our discount or lack of in account.
    }       // end of public main method.

    public static void printBookList(String[] books) {      // our argument is a String[] books array.
        // String[] books is an array of strings.
        // bookCount needs to be an int variable.
        int bookCount = books.length;

        for (int x = 0; x < books.length; x++) {
            // our loop counter for our books variable. "bookCount" is just the length of books.
            String book = books[x];     // "book" will be one of our books in our string array books.
            // truncate longer book names
            if (book.length() > 50) {       // if the length of the "book" variable is greater than 50...
                book = book.substring(0, 50) + "...";       // shortens the "book" length to 50...
                // and adds an ellipses to the end of the book variable.
                // substring() takes the start and end of where you want the substring() to read.
            }       // end of if statement for truncating long book names.
            System.out.println(x + 1 + ": " + book);        //prints "x" (one of the books in the array)...
            // adds a colon to the print statement and then prints the "book"
        }       // end of loop counter over books.length

        // does x exist here?
        // does book exist here?
        // does books exist here?
        System.out.println(books);      // this variable will print our books array, each book with corresponding index.
    }       // end of main method
}       // end of public class