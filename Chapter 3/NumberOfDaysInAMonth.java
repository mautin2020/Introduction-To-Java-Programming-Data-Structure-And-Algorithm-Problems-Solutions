package com.mycompany.exercise3;

import java.util.Scanner;
public class NumberOfDaysInAMonth {
    public static void main(String[] args){
        // create a new scanner object 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year and month: ");
        
        int year = input.nextInt();
        int month = input.nextInt();
        
        int January = 31;
        int February = year % 4;
        int March = 31;
        int April = 30;
        int May = 31;
        int June = 30;
        int July = 31;
        int August = 31;
        int September = 30;
        int October = 31;
        int November = 30;
        int December = 31;
        
        if(February == 0) 
            February = 29;
        else
            February = 28;
        
        switch(month) {
            case 1: System.out.println("January " + year + " has " + January + " days");break;
            case 2: System.out.println("February " + year + " has " + February + " days");break;
            case 3: System.out.println("March " + year + " has " + March + " days");break;
            case 4: System.out.println("April " + year + " has " + April + " days");break;
            case 5: System.out.println("May " + year + " has " + May + " days");break;
            case 6: System.out.println("June " + year + " has " + June + " days");break;
            case 7: System.out.println("July " + year + " has " + July + " days");break;
            case 8: System.out.println("August " + year + " has " + August + " days");break;
            case 9: System.out.println("September " + year + " has " + September + " days");break;
            case 10: System.out.println("October " + year + " has " + October + " days");break;
            case 11: System.out.println("November " + year + " has " + November + " days");break;
            case 12: System.out.println("December " + year + " has " + December + " days");break;
        }        
    }
}
