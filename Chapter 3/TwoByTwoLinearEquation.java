package com.mycompany.exercise3;

import java.util.Scanner;
public class TwoByTwoLinearEquation {
    public static void main(String[] args) {
        // create new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        
        // take all the parameters into a variable
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        
        if((a * d) - (b * c) == 0)
            System.out.println("The equation has no solution");
        else
            System.out.println("x is " + x + " and y is " + y);
    }
}