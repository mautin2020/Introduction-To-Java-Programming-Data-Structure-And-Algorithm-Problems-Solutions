package com.mycompany.exercise3;

import java.util.Scanner;
public class PointInACircle {
    public static void main(String[] args) {
        // create a new scanner object
        
        double x1 = 0.0;
        double y1 = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        double distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        
        System.out.print("Point " + " (" + x2 + ", " + y2 + ")" );
        if(distance <= 10.0) 
            System.out.println(" is in the circle");
        else 
            System.out.println(" is not in the circle");
    }
}
