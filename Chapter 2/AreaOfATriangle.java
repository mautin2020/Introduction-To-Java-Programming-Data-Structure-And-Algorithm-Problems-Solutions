package com.mycompany.exercise_2;

import java.util.Scanner;
public class AreaOfATriangle {
    public static void main(String[] args){
        // create new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coordinate of three points separated by spaces: ");
        
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        double s1 = findSide(x1, y1, x2, y2);
        double s2 = findSide(x2, y2, x3, y3);
        double s3 = findSide(x2, y2, x3, y3);
        
        double s = (s1 + s2 + s3) / 2;
        
        double area = Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);
        System.out.println("The area of the triangle is: " + area);
    }
    
    public static double findSide(double x0, double y0, double x1, double y1){
        return Math.pow(Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2), 0.5);
    }
}
