package com.mycompany.exercise_2;
import java.util.Scanner;

public class CalculatingEnergy {
    public static void main(String[] args) {
        // create a new scanner object 
        Scanner input = new Scanner(System.in);
        
        // input for amount of water in kg
        System.out.print("Enter the amount of water in kilograms: ");
        double kilogram = input.nextDouble();
        
        // input for initialTemperature 
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        
        // input for final temperature 
        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();
        
        double energy = kilogram * (finalTemperature - initialTemperature) * 4184;
        
        // Output the result 
        System.out.println("The energy needed is: " + energy);
    }
}
