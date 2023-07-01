package com.mycompany.exercise_2;
import java.util.Scanner;
public class PoundsToKilogram {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        final double ONE_POUND_IN_KILOGRAM = 0.454;
        double poundsToConvert = input.nextDouble();
        double convertedNumber = ONE_POUND_IN_KILOGRAM * poundsToConvert;
        System.out.println(poundsToConvert + " pounds is " + convertedNumber + " in Kilogram");
    }
}
