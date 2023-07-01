package com.mycompany.exercise3;
import java.util.Scanner;
public class Exercise3 {

    public static void main(String[] args) {
        // create new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        
        if(discriminant > 0){
            double r1 = -b + Math.pow((Math.pow(b, 2) - (4 * a * c)), 0.5);
            double real1 = r1 / 2 * a;
            
            double r2 = -b - Math.pow((Math.pow(b, 2) - (4 * a * c)), 0.5);
            double real2 = r2 / 2 * a;
            
            System.out.println("The equation has two roots: " + real1 + " and " + real2);
            
        } else if (discriminant == 0) {
            double r1 = -b + Math.pow((Math.pow(b, 2) - (4 * a * c)), 0.5);
            double real1 = r1 / 2 * a;
            System.out.println("The equation has one root: " + real1);
            
        } else {
            System.out.println("The equation has no real root");
        }
    }
}