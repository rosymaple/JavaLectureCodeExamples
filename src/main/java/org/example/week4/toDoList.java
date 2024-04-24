package org.example.week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class toDoList {
    public static void main(String[] args) {

        List<String> todoList = new ArrayList<>();      // initializes todoList arrayList variable

        while (true) {      // while loop will run if true...
            String data = stringInput("Please type a task you need to do, or press Enter to quit");
            // while the user keeps typing tasks, fill "data" variable with stringInput from our user.
            if (data.length() == 0) {   // If the user just presses Enter, the length of the text is 0.
                break;      // end program
            }       // end of if statement

            if (containsIgnoresCase(todoList, data)) {      // use containsIgnoresCase method on two variables
                System.out.println("You already added that!");      // print message for user
            } else {        // if-else statement, else if the user did not already add something...
                todoList.add(data);     // add "data" to todoList
            }       // end of if-else block

            System.out.println("Thank you! Here are all of your tasks you entered: ");      // print message for user

            for (String input : todoList) {     // loop over todoList array
                System.out.println(input);      // print each element of todoList array (input)
            }       // end of for loop over todoList
            System.out.println("You have " + todoList.size() + " tasks to do.");        // size of todoList variable
        }       // end of while loop
    }       // end of main method

    public static boolean containsIgnoresCase(List<String> list, String data) {     // containsIgnoresCase method
        for (String item : list) {      // loop over elements in "list"
            if (item.equalsIgnoreCase(data)) {   // if the data variable (string user input) is an element in "list"...
                return true;        // return true to boolean method containsIgnoresCase
            }       // end of if statement
        }       // end of for loop over list variable
        return false;       // return false if the last block of code did NOT return true.
    }       // end of boolean method.
}       // end of public class.
