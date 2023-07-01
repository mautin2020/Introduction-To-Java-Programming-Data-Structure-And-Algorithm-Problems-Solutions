package com.mycompany.exercise_2;

import java.util.Scanner;
public class CalculateTips {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and gratuity rate: ");
        
        double subTotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        
        double gratuity = subTotal * (gratuityRate / 100);
        double total = gratuity + subTotal;
        
        System.out.println("The gratuity is " + gratuity + " and total is " + total);
    }
}
