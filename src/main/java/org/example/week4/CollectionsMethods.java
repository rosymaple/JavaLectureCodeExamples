package org.example.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {

    public static void main(String[] args) {        // start of main method

        List<String> animals = new ArrayList<>();       // initialize arrayList variable named "animals"

        animals.add("Cat");     // add an element to arrayList
        animals.add("Zebra");       // add element to animals arrayList
        animals.add("Fish");        // add element
        animals.add("Bird");        // add element
        animals.add("Fish");    // I meant to add "Fish" twice

        System.out.println("Original animals list: " + animals);        // print animals arrayList

        Collections.sort(animals);      // Sorts collections into order if the type of data is sortable

        System.out.println("Sorted animals list: " + animals);      // now "animals" will print a sorted arrayList

        Collections.replaceAll(animals, "Fish", "Shark");  // Replace all "Fish" elements with "Shark"
        System.out.println("Replace \"Fish\" with \"Shark\", now the list is: " + animals); //prints new list

        Collections.reverse(animals);   // reverse the order of the list
        System.out.println("In reverse order: " + animals);     //prints reverse order of animals arrayList

        Collections.shuffle(animals);   // put elements in random order
        System.out.println("Shuffled list: " + animals);        // prints a shuffled list of arrayList "animals"

        // Display the minimum value = the lowest value = for strings, the first in the alphabet
        System.out.println("First in the alphabet: " + Collections.min(animals));       // will print "bird" for user
        // Display the maximum value = the lowest value = for Strings, the last in the alphabet
        System.out.println("Last in the alphabet: " + Collections.max(animals));        // will print "zebra" for user

        Collections.fill(animals, "Koala");   // Fill the entire ArrayList with "Koala"
        System.out.println("Replaced every element with Koala and now the list is: " + animals);   //print animals list
    }       // end of main method
}       // end of public class
