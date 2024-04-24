package org.example.week4;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Removing {     // start of public class
    public static void main(String[] args)  {       // start main method

        List<String> classNames = new ArrayList<>();        // initialize new arrayList named classNames
        classNames.add("Programming Logic");        // add class to classNames
        classNames.add("Web Client Server");        // add element to classNames
        classNames.add("Project Management");       // add element to arrayList
        classNames.add("Info Tech Concepts");       // add element to classNames arrayList

        Collections.shuffle(classNames);        // use the shuffle function to randomize the classNames arrayList

        String alphabeticalFirst = Collections.min(classNames);     // sort classNames using Collections.min...
        // use Collections.min to find the first alphabetical value
        System.out.println(alphabeticalFirst);      // print alphabeticalFirst

        for (String name: classNames)   {       // loop over each name in classNames arrayList
            System.out.println(name);       // print each element in classNames arrayList
//            classNames.remove(0);       //  error
        }       // end of for loop over classNames

        System.out.println();     // print empty line
        for (int i = 0 ; i < classNames.size() ; i++)   {     // loop over classNames size
            //  index - if need to know the index as well as the data
            System.out.println(classNames.get(i));      // retrieve and print each element from classNames
            classNames.remove(0);       // remove first element from classNames arrayList
        }       // end of for loop over classNames.size()

        System.out.println();       // print empty line

        while (!classNames.isEmpty())   {       // while loop for when classNames is not empty...
            String name = classNames.remove(0);     // remove first element from classNames and call it "name"
            System.out.println(name);       // print "name" from first element in our classNames
        }       // end of while loop for while classNames is not empty

        System.out.println(classNames);     // print new classNames array list


        System.out.println(classNames);     // print new classNames array list

        classNames.remove("Project Management");        // remove "Project Management" element from classNames
        System.out.println(classNames);     // print classNames variable for user

        boolean wasRemoved = classNames.remove("Lalalalalala");     // true or false boolean variable.
        // did classNames remove "lalalalalala" element from array list?
        System.out.println(classNames + " " + wasRemoved);      // print true or false boolean. (probably not a class)

        classNames.remove(0);       // int primitive type - index are primitive integers
        System.out.println(classNames);     // print classNames array list with

        classNames.set(1, "Systems Analysis");      // set our classNames index element "1" to "Systems Analysis"
        System.out.println(classNames);     // print updated classNames arraylist for our user

        String search = "Systems Analysis";     // our "search" variable will be for "Systems Analysis"
        if (classNames.contains("C# Programming"))  {       // if classNames arrayList contains C# programming
            System.out.println("The list does contain " + search);      // print for the user: the list does contain...
        } else {        // if-else block, if classNames does not contain search variable...
            System.out.println("The list does NOT contain " + search);      // print negative message for user
        }       // end of if-else block
//
//        System.out.println(classNames.size());
//
//        classNames.clear();
//
//        System.out.println(classNames);
//        System.out.println(classNames.size());
//        System.out.println(classNames.isEmpty());

    }       // end of main method
}       // end of public class