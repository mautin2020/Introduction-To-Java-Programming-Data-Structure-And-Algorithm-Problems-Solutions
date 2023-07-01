package com.mycompany.exercise_2;

import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        
        // create a CONSTANT for pounds in KG
        final double A_POUNDS = 0.45359273;
        
        // create a CONSTANT for inch in Meters
        final double AN_INCH = 0.0254;
        
        // create a new scanner object for entering weight
        Scanner input = new Scanner(System.in);
        
        // allow user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double inputedWeight = input.nextDouble();
        
        // allow user to enter height in inches
        System.out.print("Enter height in inches: ");
        double inputedHeight = input.nextDouble();
        
        double convertedWeight = inputedWeight * A_POUNDS;
        double convertedHeight = inputedHeight * AN_INCH;
        
        System.out.println("BMI is: " + convertedWeight / Math.pow(convertedHeight, 2));
    }
}