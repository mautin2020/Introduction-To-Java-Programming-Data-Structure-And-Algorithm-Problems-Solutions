package com.mycompany.exercise_2;

import java.util.Scanner;
public class DistanceOfTwopoints {
    public static void main(String[] args) {
        // create new scanner object
        Scanner input1 = new Scanner(System.in);
        
        // ask user to enter x1 and y1
        System.out.print("Enter x1 and y1: ");
        double x1 = input1.nextDouble();
        double y1 = input1.nextDouble();
        
        // ask user to enter x2 and y2
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter x2 and y2: ");
        double x2 = input2.nextDouble();
        double y2 = input2.nextDouble();
        
        double xAxis = x2 - x1;
        double yAxis = y2 - y1;
        double computeDistance = Math.pow(xAxis, 2) + Math.pow(yAxis, 2);
        double distance = Math.pow(computeDistance, 0.5);
        
        System.out.println("The distance between the two points is " + distance);
    }
}
