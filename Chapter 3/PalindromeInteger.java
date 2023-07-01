package com.mycompany.exercise3;

import java.util.Scanner;
public class PalindromeInteger {
    public static void main(String[] args) {
        // create new Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        
        int number = input.nextInt();
        
        int numOne = number % 10;
        int numTwo = number / 100;
        
        if(numOne == numTwo) {
            System.out.println(number + " is a Palindrome!");
        } else {
            System.out.println(number + " is not a Palindrome!");
        }
    }
}
