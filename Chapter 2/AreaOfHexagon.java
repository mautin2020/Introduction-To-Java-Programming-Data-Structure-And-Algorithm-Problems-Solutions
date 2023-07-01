package com.mycompany.exercise_2;
import java.util.Scanner;
public class AreaOfHexagon {
    public static void main(String[] args) {
        // create a new Scanner object 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lenght of the side: ");
        double side = input.nextDouble();
        
        double area = Math.pow(side, 2) * ((3 * (Math.pow(3, 0.5)) / 2));
        System.out.println("The area of the hexagon is: " + area);
    }
}
