/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Connor Stanley
 */


package ex07;

import java.util.Scanner;

public class App {

    static final double CONVERSION_RATE = 0.09290304;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Asking for input in string form
        System.out.print("What is the length of the room in feet? ");
        String roomLength = in.nextLine();
        System.out.print("What is the width of the room in feet? ");
        String roomWidth = in.nextLine();


        // Numerical Conversion from string to type double to allow for decimals as well as whole numbers
        double length = Double.parseDouble(roomLength);
        double width = Double.parseDouble(roomWidth);


        // Confirmation of values entered
        System.out.print("You entered dimensions of " + length + " feet by " + width + " feet.\n");


        // Various calculations that utilize the conversion constant
        double areaFeet = length * width;
        double areaMeters = areaFeet * CONVERSION_RATE;



// Output within a single line, which cause actual mental agony.
        System.out.print("The area is:\n" + areaFeet + " square feet.\nOR\n" + areaMeters + "square meters.");








    }

}
