package com.mycompany.exercise3;

import java.util.Scanner;
public class AdditionGame {
    public static void main(String[] args) {
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        int number1 = (int)(1 + Math.random() * 100);
        int number2 = (int)(1 + Math.random() * 100);
        
        System.out.print("What is " + number1 + " + " + number2 + "?: ");
        int answer = input.nextInt();
        if(number1 + number2 == answer) 
            System.out.println("You are correct");
        else 
            System.out.println("Wrong answer");
    }
}
