package com.mycompany.exercise3;

import java.util.Scanner;
public class CurrencyExchange {
    public static void main(String[] args){
        // create scanner object
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter amount to convert
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int currency = input.nextInt();
        
        switch(currency) {
            case 0: System.out.print("Enter the dollar amount: ");
               double dollarAmount = input.nextDouble();
               System.out.println("$" +dollarAmount + " is " + dollarAmount * exchangeRate + "yuan"); break;
            case 1: System.out.print("Enter the RMD amount: ");
               double RMBAmount = input.nextDouble();
               System.out.println(RMBAmount + " yuan is " + "$" + ((RMBAmount * 100) / exchangeRate) / 100); break;
            default: System.out.println("Incorrect Input");
        }
    }
}
