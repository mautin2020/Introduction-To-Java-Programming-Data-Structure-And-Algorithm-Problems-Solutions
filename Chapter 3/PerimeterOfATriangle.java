package com.mycompany.exercise3;

import java.util.Scanner;
public class PerimeterOfATriangle {
    public static void main(String[] args) {
        // create a scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the three sides of the triangle: ");
        double firstEdge = input.nextDouble();
        double secondEdge = input.nextDouble();
        double thirdEdge = input.nextDouble();
        
        double groupOne = firstEdge + secondEdge;
        double groupTwo = secondEdge + thirdEdge;
        double groupThree = firstEdge + thirdEdge;
        
        double perimeterOfTriangle = firstEdge + secondEdge + thirdEdge;
        
        if(groupOne < thirdEdge || groupTwo < firstEdge || groupThree < secondEdge) 
            System.out.println("Invalid Input");
        else 
            System.out.println("The Perimeter of the triangle is " + perimeterOfTriangle);
    }
}