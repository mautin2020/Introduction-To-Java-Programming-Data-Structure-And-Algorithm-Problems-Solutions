package com.mycompany.exercise4;

import java.util.Scanner;

public class MonetaryUnit{
    public static void main(String[] args) {
        
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        // Receive the amount
        System.out.print("Enter an amount in decimal e.g. 11.56: ");
        String amount = input.next();
        
        // find the number of dollars
        int getFirstIndex = amount.indexOf(".");

        String numOfDollars =  amount.substring(0, getFirstIndex);
        String remainingAmount = amount.substring(getFirstIndex + 1);

        System.out.println("Your amount " + amount + " consists of ");
        System.out.println(numOfDollars + " dollars and " + remainingAmount + " cents ");
    }
}