package com.mycompany.exercise4;

import java.util.Scanner;

public class CornerPointCoordinates {
    public static void main(String[] args) {
        // create new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();
        
        double angleIncrements = Math.toRadians(360 / 5.0); 
        double p1angle = angleIncrements;
        double p2angle = angleIncrements * 2; 
        double p3angle = angleIncrements * 3;
        double p4angle = angleIncrements * 4;
        double p5angle = angleIncrements * 5;
        
        System.out.println("The coordinate of the five points are: ");
        System.out.printf("(%.2f, %.2f)\n", radius * Math.sin(p1angle), radius * Math.cos(p1angle));
        System.out.printf("(%.2f, %.2f)\n", radius * Math.sin(p2angle), radius * Math.cos(p2angle));
        System.out.printf("(%.2f, %.2f)\n", radius * Math.sin(p3angle), radius * Math.cos(p3angle));
        System.out.printf("(%.2f, %.2f)\n", radius * Math.sin(p4angle), radius * Math.cos(p4angle));
        System.out.printf("(%.2f, %.2f)\n", radius * Math.sin(p5angle), radius * Math.cos(p5angle));  
    }
}
