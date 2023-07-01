package com.mycompany.exercise4;

import java.util.Scanner;

public class GreateCircleDistance {
    public static void main(String[] args) {
        // create new scanner object
        
        // radius of the earth
        final double radius = 6371.01;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        
        double x1 = input.nextDouble();
        double x1radians = Math.toRadians(x1);
        
        double y1 = input.nextDouble();
        double y1radians = Math.toRadians(y1);
        
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double x2radians = Math.toRadians(x2);
        
        double y2 = input.nextDouble();
        double y2radians = Math.toRadians(y2);
        
        double distance = radius * Math.acos(Math.sin(x1radians) * Math.sin(x2radians) + 
                                   Math.cos(x1radians) * Math.cos(x2radians) * 
                                   Math.cos(y1radians - y2radians));
        System.out.println("The distance between the two points is: " + distance + "km");
    }
}