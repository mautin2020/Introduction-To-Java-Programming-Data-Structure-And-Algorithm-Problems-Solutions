package com.mycompany.exercise4;

import java.util.Scanner;
public class DecimalToHex {
    public static void main(String[] args) {
        // create new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        
        int userInput = input.nextInt();
        
        if(userInput >= 0 && userInput <= 9)
            System.out.println("The hex value is " + userInput);
        else if(userInput >= 10 && userInput <= 15)
            System.out.println("The hex value is " + (char)(userInput + 'A' - 10));
        else 
            System.out.println(userInput + " is an invalid input");
    }
}
