package org.example.week1_if_statements;

public class ScopeExamples_printBookList {

    public static void main(String[] books) {

        for (int x = 0; x < books.length; x++) {    // start of our books.length loop counter
            String book = books[x];     // book will represent our loop counter in this block of code.

            // truncate longer book names
            if (book.length() > 50) {       // if the length of an element in the books array is greater than 50...
                book = book.substring(0, 50) + "...";       // subString() will truncate the first 50 characters...
                // and add an ellipses at the end of the array element.
            }       // end of if statement.
            System.out.println(x + 1 + ": " + book);        // prints an element from our books array with formatting..
            // formatting for readability.
        }       // end of loop counter for books array
    }       // end of public method
}       // end of public class
