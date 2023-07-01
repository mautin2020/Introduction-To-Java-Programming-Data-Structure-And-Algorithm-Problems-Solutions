package com.mycompany.exercise4;

import java.util.Scanner;

public class CheckSSN{
    public static void main(String[] args) {
        // create new scanner object 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String SSN = input.next();
        
        char d1 = SSN.charAt(0);
        char d2 = SSN.charAt(1);
        char d3 = SSN.charAt(2);
        char d4 = SSN.charAt(4);
        char d5 = SSN.charAt(5);
        char d7 = SSN.charAt(7);
        char d8 = SSN.charAt(8);
        char d9 = SSN.charAt(9);
        char d10 = SSN.charAt(10);

        boolean isSSN = (Character.isDigit(d1) && Character.isDigit(d2) 
        && Character.isDigit(d3) && Character.isDigit(d4) 
        && Character.isDigit(d5) && Character.isDigit(d7)
        && Character.isDigit(d7) && Character.isDigit(d8)
        && Character.isDigit(d9) && Character.isDigit(d10));

        System.out.print(SSN);
        System.out.println((isSSN) ? " is a valid security number" : " is an invalid security number");
    }
}