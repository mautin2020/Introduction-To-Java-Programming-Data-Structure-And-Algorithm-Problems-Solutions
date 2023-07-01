package com.mycompany.exercise3;

import java.util.Scanner;
public class WindChillTemperature {
    public static void main(String[] args){
        // create a new scanner object
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter temperature in fahreinheit
        System.out.print("Enter the temperature in Fahreinheit between -58deg and 41deg: ");
        double temperature = input.nextDouble();
        
        // prompt the user to enter the wind speed
        System.out.print("Enter the speed (<=2): ");
        double velocity = input.nextDouble();
        
        if(temperature >= -58 && temperature <= 41 && velocity >=2) {
            double twc = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(velocity, 0.16)) + (0.4275 * temperature * Math.pow(velocity, 0.16));
            System.out.println("The wind chill index is: " + twc);
        } else 
            System.out.println("Invalid range");
    }
}