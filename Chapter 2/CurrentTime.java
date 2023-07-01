package com.mycompany.exercise_2;
import java.util.Scanner;
public class CurrentTime {
    public static void main(String[] args){
        // create new scanner object
        Scanner input = new Scanner(System.in);
        // prompt the user to enter the time offset in GMT
        System.out.print("Enter the time offset in GMT: ");
        int offset = input.nextInt();
        
        // Obtain the total Milliseconds since midnight January 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        
        // obtain the total seconds
        long totalSeconds = totalMilliseconds / 1000;
        
        // compute the current seconds in the minute and hour
        long currentSeconds = totalSeconds % 60;
        
        // obtain the total minutes
        long totalMinutes = totalSeconds / 60;
        
        // compute the current minute in  the hour
        long currentMinute = totalMinutes % 60;
        
        // obtain total hour
        long totalHour = totalMinutes / 60;
        
        // compute the current hour
        long currentHour = totalHour % 24;
        currentHour += offset;
        
        // Display the output
        System.out.println("The Current time is: " + currentHour + ":" + currentMinute + ":" + currentSeconds);
        
    }
}
