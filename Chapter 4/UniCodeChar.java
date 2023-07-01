package com.mycompany.exercise4;

import java.util.Scanner;
public class UniCodeChar {
    public static void main(String[] args) {
        // create new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        
        String userInput = input.next();
        
        char stringConverted = userInput.charAt(0);
        System.out.println("The Unicode for the character " + userInput + " is " + (int)stringConverted);
    }
}
