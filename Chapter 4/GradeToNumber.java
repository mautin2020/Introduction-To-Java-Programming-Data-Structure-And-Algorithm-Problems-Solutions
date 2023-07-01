package com.mycompany.exercise4;

import java.util.Scanner;
public class GradeToNumber {
    public static void main(String[] args){
        // create new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String userInput = input.nextLine();
        
        char ch = userInput.charAt(0);
        
        if(Character.isLetter(ch)){
             switch(Character.toUpperCase(ch)) {
                case 'A': System.out.println("The numeric value for grade A is 4"); break;
                case 'B': System.out.println("The numeric value for grade B is 3"); break;
                case 'C': System.out.println("The numeric value for grade C is 2"); break;
                case 'D': System.out.println("The numeric value for grade D is 1"); break;
                case 'E': System.out.println("The numeric value for grade E is 0"); break;
                default: System.out.println(ch + " is an invalid grade");
        } 
       } else 
             System.out.println("Invalid Character!");
    }
}
