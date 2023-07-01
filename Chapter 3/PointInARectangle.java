package com.mycompany.exercise3;

import java.util.Scanner;
public class PointInARectangle {
    public static void main(String[] args){
        // create new Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        
        double x1 = 0.0;
        double y1 = 0.0;
        
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        double height = 5.0;
        double width = 10.0;
        
        double horizontalMinimumRange = width / 2;
        double verticalMinimumRange = height / 2;
        
        double horizontalDistance = Math.sqrt((Math.pow((x2 - x1), 2)));
        double verticalDistance = Math.sqrt((Math.pow((y2 - y1), 2)));
        
        System.out.print("Point " + " (" + x2 + ", " + y2 + ")" );
        if(horizontalDistance <= horizontalMinimumRange && verticalDistance <= verticalMinimumRange)
            System.out.println(" is in the rectangle");
        else
            System.out.println("is not in the rectangle");
    }
}