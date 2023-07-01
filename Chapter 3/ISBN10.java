package com.mycompany.exercise3;
import java.util.Scanner;

public class ISBN10 {
    public static void main(String[] args) {
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first 9 digits of an ISBN as an integer: ");
        int d1 = input.nextInt();
        int d2 = input.nextInt();
        int d3 = input.nextInt();
        int d4 = input.nextInt();
        int d5 = input.nextInt();
        int d6 = input.nextInt();
        int d7 = input.nextInt();
        int d8 = input.nextInt();
        int d9 = input.nextInt();
        
        int ISBN = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9))%11;
        if(ISBN == 10) 
            System.out.println("The ISBN-10 number is " +d1+d2+d3+d4+d5+d6+d7+d8+d9+"X");
        else
            System.out.println("The ISBN-10 number is " +d1+d2+d3+d4+d5+d6+d7+d8+d9+ISBN);
    }
}