package com.mycompany.exercise_2;

import java.util.Scanner;

public class WindChillTemperature {
    public static void main(String[] args) {
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter the tempeature in fahreinheit
        System.out.print("Enter the temperature in Fahreinheit between 58deg Fahreinheit and -41deg Farheinheit: ");
        double temperature = input.nextDouble();
        
        // prompt the user to enter the velocity
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double velocity = input.nextDouble();
        
        double twc = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(velocity, 0.16)) + (0.4275 * temperature * Math.pow(velocity, 0.16));
        System.out.print("The wind chill index is: " + twc);
    }
}
