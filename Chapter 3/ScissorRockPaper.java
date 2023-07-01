package com.mycompany.exercise3;

import java.util.Scanner;
public class ScissorRockPaper {
    public static void main(String[] args){
        // create a new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Scissor (0), rock(1), paper(2): ");
        
        int userChoice = input.nextInt();
        int computerChoice = (int)(Math.random() * 3);
               
        String message = "";
        if(userChoice == 0 && computerChoice == 0)
            message += "The computer is a Scissor. You are Scissor too: It is a draw!";
        else if(userChoice == 1 && computerChoice == 1)
            message += "The computer is a Rock. You are Rock too: It is a draw!";
        else if(userChoice == 2 && computerChoice ==2)
            message +="The computer is a Paper. You are Paper too: It is a draw!";
        else if(userChoice == 0 && computerChoice == 1)
            message += "The computer choice is a Rock. You are Scissor: You lost you may try again!";
        else if(userChoice == 1 && computerChoice == 0)
            message += "The computer choice is a Scissor. You are Rock: You won!";
        else if(userChoice == 1 && computerChoice == 2)
            message += "The computer choice is paper. You are Rock: You lost you may try again!";
        else if(userChoice == 2 && computerChoice == 1)
            message += "The computer is a Rock. You are paper: You won!";
        else if(userChoice == 0 && computerChoice == 2)
            message += "The computer choice is Paper. You are Scissor: You won!";
        else if(userChoice == 2 && computerChoice == 0)
            message += "The computer choice is Scissor. You are Paper: You lost you may try again!";
     System.out.println(message);
    }
}