package com.mycompany.exercise4;

import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        // create new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        
        String userInput = input.nextLine();
        char ch = userInput.charAt(0);
        if(Character.isLetter(ch)) {
            switch(Character.toUpperCase(ch)){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': System.out.println(ch + " is a vowel"); break;
                default: System.out.println(ch + " is a consonant");
            }
        }
        else 
            System.out.println(ch + " is an invalid input");
    }
}