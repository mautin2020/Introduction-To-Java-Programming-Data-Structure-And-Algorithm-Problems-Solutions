package com.mycompany.exercise3;

import java.util.Scanner;
public class PointOnLineSegment {
    public static void main(String[] args){
        // create new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();        
        
        boolean onTheLine = !(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0 ||
			((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0 ||
			(x2 < x0) || (y2 < y0) || (x2 > x1) || (y2 > y1));
        
        // Display result
	System.out.print("(" + x2 + ", " + y2 + ") is ");
	if (!onTheLine)
            System.out.print("not ");
	System.out.println("on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");

    }
}