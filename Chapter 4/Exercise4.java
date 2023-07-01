package com.mycompany.exercise4;

import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        
        // initialize the scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lenght from the center of a vertex: ");
        double r = input.nextDouble();
        
        double s = (2 * r) * Math.sin(Math.PI / 5);
        
        double area = (5 * Math.pow(s, 2) / (4 * (Math.tan(Math.PI / 5))));
        System.out.printf("The area of the pentagon is %5.2f", area);
    }
}
