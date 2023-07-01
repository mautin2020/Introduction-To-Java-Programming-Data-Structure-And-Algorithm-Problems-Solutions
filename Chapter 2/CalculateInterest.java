package com.mycompany.exercise_2;

import java.util.Scanner;
public class CalculateInterest {
    public static void main(String[] args){
        // create new scanner object 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();
        
        double interest = balance * (interestRate/1200);
        System.out.println("The interest is: " + interest);
    }
}
