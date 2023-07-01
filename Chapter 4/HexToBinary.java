package com.mycompany.exercise4;

import java.util.Scanner;
public class HexToBinary {
    public static void main(String[] args) {
        // create new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String userInput = input.next();
        
        String allowedString = "0123456789ABCDEFabcdef";
        if(allowedString.contains(userInput)) {
            userInput = userInput.replaceAll("0", "0000");
            userInput = userInput.replaceAll("1", "0001");
            userInput = userInput.replaceAll("2", "0010");
            userInput = userInput.replaceAll("3", "0001");
            userInput = userInput.replaceAll("4", "0100");
            userInput = userInput.replaceAll("5", "0101");
            userInput = userInput.replaceAll("6", "0110");
            userInput = userInput.replaceAll("7", "0111");
            userInput = userInput.replaceAll("8", "1000");
            userInput = userInput.replaceAll("9", "1001");
            userInput = userInput.replaceAll("A", "1010");
            userInput = userInput.replaceAll("B", "1011");
            userInput = userInput.replaceAll("C", "1100");
            userInput = userInput.replaceAll("D", "1101");
            userInput = userInput.replaceAll("E", "1110");
            userInput = userInput.replaceAll("F", "1111");
            userInput = userInput.replaceAll("a", "1010");
            userInput = userInput.replaceAll("b", "1011");
            userInput = userInput.replaceAll("c", "1100");
            userInput = userInput.replaceAll("d", "1101");
            userInput = userInput.replaceAll("e", "1110");
            userInput = userInput.replaceAll("f", "1111");
            System.out.println("The binary value is " + userInput);
        } else 
            System.out.println(userInput + " is invalid input");
    }
}
