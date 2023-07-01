package com.mycompany.exercise3;
import java.util.Scanner;

public class CostOfShipping {
    public static void main(String args[]){
        // create new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");
        
        double weight = input.nextDouble();
        double costOfShipping = 0.0;
        
        if (weight == 0 || weight < 0) {
              System.out.println("Invalid Input");
              return;
        }
        
        if (weight > 20){
         System.out.println("Package Cannot be shipped");
         return;
        }
        else if (weight > 0 && weight <= 1)
            costOfShipping = 3.5;
        else if (weight > 1 && weight <= 3)
            costOfShipping = 5.5;
        else if (weight > 3 && weight <= 10)
            costOfShipping = 8.5;
        else  if (weight > 10 && weight <= 20)
            costOfShipping = 10.5;        
        System.out.println("The Cost of Shipping package of weight " + weight + " is $" + costOfShipping);
    }
}
