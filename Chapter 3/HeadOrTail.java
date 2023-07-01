package com.mycompany.exercise3;

import java.util.Scanner;
public class HeadOrTail {
    public static void main(String[] args){
        // create new scanner object 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the flip of a coin 0 for head and 1 for tail: ");
        
        int userGuess = input.nextInt();
        
        int flipOfCoin = (int)(Math.random() * 2);
        System.out.println(flipOfCoin);
        
        if(userGuess == flipOfCoin)
            System.out.println("Correct");
        else {
            System.out.println("Wrong! Good luck next time");
            System.out.println("The correct guess is: " + flipOfCoin);
        }
    }
}
