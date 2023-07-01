package com.mycompany.exercise3;

import java.util.Scanner;
public class PointPosition {
    public static void main(String[] args) {
        // create new object 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three points for p0, p1 and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        double pointPosition = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        System.out.print("p2 is on the ");
        
        if(pointPosition > 0)
            System.out.print("left side of the line");
        if(pointPosition == 0)
            System.out.print("same line");
        if(pointPosition < 0)
            System.out.print("right side of the line");
    }
}
