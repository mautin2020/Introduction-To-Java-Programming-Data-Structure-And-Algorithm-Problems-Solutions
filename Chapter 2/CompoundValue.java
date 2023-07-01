package com.mycompany.exercise_2;

import java.util.Scanner;
public class CompoundValue {
    public static void main(String[] args) {
        // create a new Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        
        // saving amount variable
        double savingAmount = input.nextDouble();
        // monthly interest while the interest is 5% 
        // therefore the monthlyInterest is given by 5 / 100 = 0.05
        
        double monthlyInterest = 0.05/12;
        
        double previousMonthValueInAccount = 0;
        
        for(double i = previousMonthValueInAccount; i < 6; i++) {
            previousMonthValueInAccount = (previousMonthValueInAccount + savingAmount) * (1 + monthlyInterest);
        }  
        System.out.println("After the sixth month, the account value is: " + "$" + previousMonthValueInAccount);
    }
}