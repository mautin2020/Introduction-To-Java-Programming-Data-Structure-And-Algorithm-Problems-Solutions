package com.mycompany.exercise3;

import java.util.Scanner;
public class CompareCost {
    public static void main(String[] args) {
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter information for package 1
        System.out.print("Enter weight and price for package 1: ");
        double package1Weight = input.nextDouble();
        double package1Price = input.nextDouble();
        
        // prompt user to enter information for package 2
        System.out.print("Enter weight and price for package 2: ");
        double package2Weight = input.nextDouble();
        double package2Price = input.nextDouble();
        
        double package1Cost = package1Weight / package1Price;
        double package2Cost = package2Weight / package2Price;
        
        if(package1Cost < package2Cost) 
            System.out.println("Package 2 has a better price");
        else if(package1Cost > package2Cost)
            System.out.println("Package 1 has better price");
        else
            System.out.println("The Two Packages has same price");       
    }
}
