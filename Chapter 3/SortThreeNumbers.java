package com.mycompany.exercise3;

import java.util.Scanner;
public class SortThreeNumbers {
    public static void main(String[] args){
        // create new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        
        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();
        
        if(firstNumber > secondNumber){
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        
        if(secondNumber > thirdNumber) {
            int temp1 = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = temp1;   
        }
        
        if(firstNumber > secondNumber) {
            int temp2 = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp2;
        }
        
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
    }
}
