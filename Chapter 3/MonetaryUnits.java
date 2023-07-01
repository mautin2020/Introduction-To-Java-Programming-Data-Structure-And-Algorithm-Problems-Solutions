package com.mycompany.exercise3;

import java.util.Scanner;
public class MonetaryUnits {
    public static void main(String[] args){
        // create scanner object
        Scanner input = new Scanner(System.in);
        
        // Receive the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);
        
        // find the number of one dollar
        int numberOfOneDollar = remainingAmount / 100;
        remainingAmount %= 100;
        
        // find the number of quarters in the remaining amount 
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;
        
        // find the number of dimes in the remaining amount 
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;
        
        //find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;
        
        int numberOfPennies = remainingAmount;
        
        System.out.println("Your amount " + amount + " consist of ");
        // display results
                System.out.println("   " + numberOfOneDollar + (numberOfOneDollar == 1 ? " dollar " : " dollars"));
                System.out.println("   " + numberOfQuarters + (numberOfQuarters == 1 ? " quarter " : " quarters"));
                System.out.println("   " + numberOfDimes + (numberOfDimes == 1 ? " dime " : " dimes"));
                System.out.println("   " + numberOfNickels + (numberOfNickels == 1 ? " nickel " : " nickels"));
                System.out.println("   " + numberOfPennies + (numberOfPennies == 1 ? " penny " : " pennies"));
           
        }
}
