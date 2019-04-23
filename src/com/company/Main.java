package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Project one: Write a Java program to create a new array list to hold colors.

     &

	Project two: Add at least 3 colors (string) to the array list and print out all its values.
	 */

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("White");

        System.out.println(colors);




	/*
	Project Three: Using the array list created above, print out the value at index 1.
	 */

        System.out.println(colors.get(1)); //Get allows you to call an idex for an arraylist

	/*
	Project Four: Using the array list above, prompt the user for one new color, and add that color to the array list.
	 */
        Scanner keyboard = new Scanner(System.in);
//	    System.out.println("Would you like to add a color to the list? "  );
//	    String userInput= keyboard.nextLine();
//	    colors.add(userInput);
//	    System.out.println(colors);
	/*
	Using the array list, continue prompting the user for colors until they type in "Q" or "q" to quit. Each time the
	 user enters a color, add that to the array list. Print out the list at the end.
	 */

        //System.out.print("If you Would like to quit enter q when promted" );

        Boolean newColor = true;

        while (newColor == true) {
            System.out.println("Add your color to the list:  If you would like to exit enter Q");
            String userInput= keyboard.nextLine();

            if (userInput.equalsIgnoreCase("q")){
               System.out.println("You are out of the loop");
                newColor = false;
            }
            else {
                newColor = true;
                colors.add(userInput);
                System.out.println(colors);
                }


        }
    }
}
