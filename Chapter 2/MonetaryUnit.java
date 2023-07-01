package com.mycompany.exercise_2;

import java.util.Scanner;
public class MonetaryUnit {
    public static void main(String[] args) {
        // create new scanner object 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount value as integer: ");
        
        int beginingAmount = input.nextInt();
        
        int amount = beginingAmount;
        // find the number of dollars
        int numberOfDollar = amount / 100;
        amount %= 100;
        
        // find the number of quarters in the amount remainig 
        int numberOfQuarters = amount / 25;
        amount %= 25;
        
        // find the number of dimes in the amount remaining 
        int numberOfDimes = amount / 10;
        amount %= 10;
        
        // find the number of nickels
        int numberOfNickels = amount / 5;
        amount %= 5;
        
        // find the number of pennies in the amount remaining
        int numberOfPennies = amount;
        
        // display result
        System.out.println("Your amount " + beginingAmount + " consist of");
        System.out.println("     " + numberOfDollar + " dollars");
        System.out.println("     " + numberOfQuarters + " quarters");
        System.out.println("     " + numberOfDimes + " dimes");
        System.out.println("     " + numberOfNickels + " nickels");
        System.out.println("     " + numberOfPennies + " pennies");
    }
}
