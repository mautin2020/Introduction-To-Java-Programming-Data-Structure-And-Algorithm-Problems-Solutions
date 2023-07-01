package com.mycompany.exercise_2;
import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args){
        // create a new Scanner object 
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter driving distance
        System.out.print("Enter the driving distance: ");
        double drivingDistance = input.nextDouble();
        
        // prompt the user to enter the miles per gallon
        System.out.print("Enter the miles per gallon: ");
        double milesPerGalon = input.nextDouble();
        
        // prompt the user to enter the price per galon
        System.out.print("Enter the price per galon: ");
        double pricePerGalon = input.nextDouble();
        
        double costOfDriving = (drivingDistance / milesPerGalon) * pricePerGalon;
        
        System.out.println("The cost of driving is: $" + costOfDriving);
    }
}
