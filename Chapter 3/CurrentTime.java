package com.mycompany.exercise3;

import java.util.Scanner;
public class CurrentTime {
    public static void main(String[] args){
        
        // create new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT ");
        // prompt user to enter the time offset in GMT
        int offSet = input.nextInt();
        
        // obtain the total milliseconds since midnight January 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        
        // obtain total seconds
        long totalSeconds = totalMilliseconds / 1000;
        
        // obtain current seconds 
        long currentSeconds = totalSeconds % 60;
        
        // obtain total minutes 
        long totalMinutes = totalSeconds / 60;
        
        // obtain current minutes 
        long currentMinutes = totalMinutes % 60;
        
        // obtain total hour
        long totalHour = totalMinutes / 60;
        
        long currentHour = totalHour % 24;
        
        currentHour += offSet;
        
        System.out.println("The Current time is " + ((currentHour > 12) ? currentHour - 12 : currentHour) +":" 
                + currentMinutes + ":" 
                + currentSeconds
                +((currentHour > 12) ? "PM" : "AM"));
    }
}