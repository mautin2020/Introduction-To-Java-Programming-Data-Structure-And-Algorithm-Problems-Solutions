package com.mycompany.exercise_2;
import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        // create new scanner object 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Investment amount: ");
        double investmentAmount = input.nextDouble();
        
        System.out.print("Enter anual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();
        
        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();
        
        double yearToPercent = annualInterestRate / 100;
        double monthlyInterestRate = yearToPercent / 12;
                
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        System.out.println("Future value is: $" + futureInvestmentValue);
    }
}
