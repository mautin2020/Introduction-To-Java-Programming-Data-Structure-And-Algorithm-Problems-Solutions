package com.mycompany.exercise3;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args){
        // create new scanner object
        Scanner input = new Scanner(System.in);
        int randomDigit = (int)(Math.random() * 1000);
        
        System.out.print("Enter your three digit number: ");
        int userGuess = input.nextInt();
        
        // divide random numbers
        int number1 = randomDigit / 100;
        int number2 = randomDigit % 100;
        int number3 = number2 / 10;
        number3 %= 10;
        
        // divide user guess
        int userGuess1 = userGuess / 100;
        int userGuess2 = userGuess % 100;
        int userGuess3 = userGuess2 / 10;
        userGuess3 %= 10;
        
        // print out divided random number generated
        System.out.println("Divided random number generated");
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        
        // print out divided gues number
        System.out.println("Divided guess number generated");
        System.out.println(userGuess1);
        System.out.println(userGuess2);
        System.out.println(userGuess3);
        
        System.out.println("The lottery number is " + randomDigit);
        String result = "";
        
        if(randomDigit == userGuess)
            result += "Exact match: you win $10,000";
        
        else if ((userGuess1 == number1 || userGuess1 == number2 || userGuess1 == number3) && 
                (userGuess2 == number1 || userGuess2 == number2 || userGuess2 == number3) &&
                (userGuess3 == number1 || userGuess3 == number2 || userGuess3 == number3))
            result += "Match all digits: you win $3,000";
        
        else if ((userGuess1 == number1 || userGuess1 == number2 || userGuess1 == number3) &&
                (userGuess3 == number1 || userGuess3 == number2 || userGuess3 == number3) &&
                (userGuess2 == number1 || userGuess2 == number2 || userGuess2 == number3))
            result += "Match all digits: you win $3,000";
        
        else if ((userGuess2 == number1 || userGuess2 == number2 || userGuess2 == number3) &&
                (userGuess1 == number1 || userGuess1 == number2 || userGuess1 == number3) &&
                (userGuess3 == number1 || userGuess3 == number2 || userGuess3 == number3))
            result += "Match all digits: you win $3,000";
        
        else if ((userGuess2 == number1 || userGuess2 == number2 || userGuess2 == number3) &&
                (userGuess3 == number1 || userGuess3 == number2 || userGuess3 == number3) &&
                (userGuess1 == number1 || userGuess1 == number2 || userGuess1 == number3))
            result += "Match all digits: you win $3,000";
        
        else if ((userGuess3 == number1 || userGuess3 == number2 || userGuess3 == number3) &&
                (userGuess1 == number1 || userGuess1 == number2 || userGuess1 == number3) &&
                (userGuess2 == number1 || userGuess2 == number2 || userGuess2 == number3))
            result += "Match all digits: you win $3,000";
        
        else if ((userGuess3 == number1 || userGuess3 == number2 || userGuess3 == number3) &&
                (userGuess2 == number1 || userGuess2 == number2 || userGuess2 == number3) &&
                (userGuess1 == number1 || userGuess1 == number2 || userGuess1 == number3))
            result += "Match all digits: you win $3,000";
        
        else if (userGuess1 == number1 || userGuess1 == number2 || userGuess1 == number3 || 
                userGuess2 == number1 || userGuess2 == number2 || userGuess2 == number3 ||
                userGuess3 == number1 || userGuess3 == number2 || userGuess3 == number3)
            result += "Match one digit: you win $1,000";
        else 
            result += "Sorry no match, play again!";
        
        System.out.println(result);
    }
}
