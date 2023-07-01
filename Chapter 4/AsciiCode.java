package com.mycompany.exercise4;

import java.util.Scanner;

public class AsciiCode {
    public static void main(String[] args) {
        // create new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII Code: ");
        int number = input.nextInt();
        
        char converted = (char)number;
        System.out.println("The character for ASCII code " + number + " is " + converted);
        
    }
}
