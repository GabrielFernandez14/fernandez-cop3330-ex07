/* Gabriel Fernandez
 * COP3330 - Summer CV01
 * "Motivated" Practice Exercises
 * Exercise 07 - Area of a Rectangular Room
 */

package org.example;

// Import necessary libraries
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class App 
{

    // Main function
    public static void main( String[] args )
    {
        // Declare conversion factor as a constant
        final double CONVERSION_FACTOR = 0.09290304;

        // Prompt user to input the length and the width and store them as ints
        System.out.println("What is the length of the room in feet?");
        Scanner lengthInput = new Scanner(System.in);
        int length = lengthInput.nextInt();

        System.out.println("What is the width of the room in feet?");
        Scanner widthInput = new Scanner(System.in);
        int width = widthInput.nextInt();

        // Print out the dimensions
        System.out.println("You entered dimensions of " + length + " feet by "
                            + width + " feet.");

        // Calculate the areas
        int areaFeet = length * width;
        double areaMeters = areaFeet * CONVERSION_FACTOR;

        // Print the area in feet
        System.out.println("The area is\n" + areaFeet + " square feet");

        // Round the answer of the area in meters to 3 decimal places
        DecimalFormat df = new DecimalFormat("0.000");
        df.setRoundingMode(RoundingMode.CEILING);

        // Print the area in meters
        System.out.println(df.format(areaMeters) + " square meters");
    }
}
