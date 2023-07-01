package com.mycompany.exercise3;

import java.util.Scanner;
public class ComputeAndInterpreteBMI {
    public static void main(String[] args) {
        
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        // prompt user to enter weight
        System.out.print("Enter Weight: ");
        double weight = input.nextDouble();
        
        // prompt user to enter feet
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        
        // prompt the user to enter inches
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();
        
        //create constant value for kilogram_per_pound and meter_per_inch
        final double KILOGRAM_PER_POUND = 0.45359237;
        final double METER_PER_INCH = 0.0254;
        
        double height = inches + (feet * 12);
        
        double weightInKilogram = weight * KILOGRAM_PER_POUND;
        double heightInMeters = height * METER_PER_INCH;
        
        double bmi = weightInKilogram / Math.pow(heightInMeters, 2);
        
        System.out.println("BMI is " + bmi);
        if(bmi < 18.5) 
            System.out.println("Underweight");
         else if( bmi < 25) 
            System.out.println("Normal");
         else if(bmi < 30) 
            System.out.println("Overweight");
         else 
            System.out.println("Obese");
    }
}
