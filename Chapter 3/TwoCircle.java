package com.mycompany.exercise3;

import java.util.Scanner;
public class TwoCircle {
    public static void main(String[] args) {
    // create new object scanner
    Scanner input = new Scanner(System.in);
    
        // prompt user to enter circle1's information
        System.out.print("Enter Circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        
        // prompt user to enter circle2's information
        System.out.print("Enter Circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();
        
        double circleOneDistance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.print("cirle2 ");
        
        if(circleOneDistance <= Math.abs(r1 - r2))
            System.out.print("is inside circle1");
        else if(circleOneDistance <= r1 + r2)
            System.out.print("overlaps circle1");
        else
            System.out.print("does not overlap cirle1");
    }
}