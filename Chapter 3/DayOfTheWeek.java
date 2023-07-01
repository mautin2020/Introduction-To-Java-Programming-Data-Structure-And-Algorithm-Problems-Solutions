package com.mycompany.exercise3;

import java.util.Scanner;
public class DayOfTheWeek {
    public static void main(String[] args) {
      // create new scanner object 
      Scanner input = new Scanner(System.in);
      
         // prompt user to enter year
        System.out.print("Enter year: (e.g. 2012): ");
        int year = input.nextInt();
        
          // year denoted with j
        int j = year / 100;
        
        // prompt user to enter the month which is denoted with m
        System.out.print("Enter month: 1- 12: ");
        int m = input.nextInt();
        
          //  converting user input month 1 to 13
        if(m == 1 || m == 2) {
            m = (m == 1) ? 13 : 14;
            year --;
        }
        
        // prompt the user to enter day of the month which is denoted with q
        System.out.print("Enter day of the month: 1 - 31: ");
        int q = input.nextInt();
        
        // year of the century
        int k = year % 100;
        
        // zeller's congruence algorithm        
        int h = (q + (26 * (m + 1)) / 10 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        
        System.out.print("Day of the week is ");
        
        switch(h) {
            case 0: System.out.println("Saturday"); break;
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); 
        }
    }
}