package com.mycompany.exercise_2;
import java.util.Scanner;
public class FeetToMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        
        final double METER_PER_FOOT = 0.305;
        double valueForFeet = input.nextDouble();
        
        System.out.println(valueForFeet + " Feet is " + valueForFeet * METER_PER_FOOT + " in meters");
    }
}
