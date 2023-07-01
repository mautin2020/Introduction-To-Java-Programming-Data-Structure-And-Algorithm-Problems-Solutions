package com.mycompany.exercise_2;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
         System.out.print("Enter a digits between 0 and 1000: ");

        Scanner input = new Scanner(System.in);

        int useNumber = input.nextInt();
        int sum = 0;
        while(useNumber > 0){
            int lastDigit = useNumber % 10;
            sum += lastDigit;
            useNumber /= 10;
        }
        System.out.println("The sum of digits is: " + sum);
    }
}