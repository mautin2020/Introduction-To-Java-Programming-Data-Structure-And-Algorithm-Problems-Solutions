package com.mycompany.exercise3;

import java.util.Scanner;
public class AdditionQuiz {   
    public static void main(String[] args) {
    
    // create new scanner object
    Scanner input = new Scanner(System.in);
    
    int number1 = (int)(Math.random() * 1000);
    int number2 = (int)(Math.random() * 1000);
    int number3 = (int)(Math.random() * 1000);
    
    System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
    int answer = input.nextInt();
    int correctAnswer = number1 + number2 + number3;
    
    if(answer == correctAnswer) 
        System.out.println("Your answer is correct");
    else System.out.println("Wrong answer ");
    }
}