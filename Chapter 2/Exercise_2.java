package com.mycompany.exercise_2;
import java.util.Scanner;
public class Exercise_2 {
    public static void main(String[] args) {
        // create a new Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double numberToConvert = input.nextDouble();
        double convertToFahrenheit = (9.0 / 5) * numberToConvert + 32;
        System.out.println(numberToConvert + " Celsius is: " + convertToFahrenheit);
    }
}
