package com.mycompany.exercise_2;
import java.util.Scanner;
public class NumberOfYears {
    public static void main(String[] args) {
       
        // initiate scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        
        int minutes = input.nextInt();
        
        final int MIN_HOUR = 60;
        final int HOUR_IN_A_DAY = 24;
        final int DAYS_IN_A_YEAR = 365;
        
         // convert minutes to year
        int minuteToYear = minutes / MIN_HOUR / HOUR_IN_A_DAY / DAYS_IN_A_YEAR;
        
        // take the remainder as remaining days
        int remainingDays = minutes / MIN_HOUR / HOUR_IN_A_DAY % DAYS_IN_A_YEAR;
        
        // show output
        System.out.println(minutes + " minutes is approximately " + minuteToYear + " years and " + remainingDays + " days ");
    }
}
