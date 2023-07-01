package com.mycompany.exercise_2;
import java.util.Scanner;

public class RunAwayLength {
    public static void main(String[] args) {
        // create a new scanner object 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Speed and Acceleration: ");
        
        int speed = input.nextInt();
        double acceleration = input.nextDouble();
        
        double length = Math.pow(speed, 2) / (2 * acceleration);
        
        System.out.println("The minimum runaway length for this plane is " + length);
    }
}
