package com.mycompany.exercise4;

import java.util.Scanner;
public class PhoneKeyPad {
    public static void main(String[] args){
        // create new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String userInput = input.nextLine();
        char ch = userInput.charAt(0);
        ch = Character.toUpperCase(ch);
        
        // initialize number to 0
        int number = 0;
        if(Character.isLetter(ch)) {          
            if(ch >= 'W')
                number = 9;
            else if(ch >= 'T')
                number = 8;
            else if(ch >= 'P')
                number = 7;
            else if(ch >= 'M')
                number = 6;
            else if(ch >= 'J')
                number = 5;
            else if(ch >= 'G')
                number = 4;
            else if(ch >= 'D')
                number = 3;
            else if(ch >= 'A')
                number = 2;
            System.out.println("The corresponding number is " + number);
        }
        else 
            System.out.println(ch + " is an invalid input");
    }
}