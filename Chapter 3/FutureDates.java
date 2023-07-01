package com.mycompany.exercise3;

import java.util.Scanner;
public class FutureDates {
    public static void main(String[] args) {
        // create new Scanner object
        Scanner input = new Scanner(System.in);
        // today's day
        System.out.print("Enter today's day: ");
        int todayDay = input.nextInt();
        // elapsed day
        System.out.print("Enter the number of days elapsed since today: ");
        int ellapsedDay = input.nextInt();
                
//        int futureDayNumber = (todayDay + ellapsedDay) % 7;
        
        switch(todayDay) {
            case 0: 
                switch ((todayDay + ellapsedDay) % 7) {
                case 0: System.out.println("Today's day is Sunday and the future day is Sunday"); break;
                case 1: System.out.println("Today's day is Sunday and the future day is Monday"); break;
                case 2: System.out.println("Today's day is Sunday and the future day is Tuesday"); break;
                case 3: System.out.println("Today's day is Sunday and the future day is Wednesday"); break;
                case 4: System.out.println("Today's day is Sunday and the future day is Thursday"); break;
                case 5: System.out.println("Today's day is Sunday and the future day is Friday"); break;
                case 6: System.out.println("Today's day is Sunday and the future day is Saturday"); break;
            } break;
            case 1:
                switch ((todayDay + ellapsedDay) % 7) {
                case 0: System.out.println("Today's day is Monday and the future day is Sunday"); break;
                case 1: System.out.println("Today's day is Monday and the future day is Monday"); break;
                case 2: System.out.println("Today's day is Monday and the future day is Tuesday"); break;
                case 3: System.out.println("Today's day is Monday and the future day is Wednesday"); break;
                case 4: System.out.println("Today's day is Monday and the future day is Thursday"); break;
                case 5: System.out.println("Today's day is Monday and the future day is Friday"); break;
                case 6: System.out.println("Today's day is Monday and the future day is Saturday"); break;
            } break;
            case 2:
                switch ((todayDay + ellapsedDay) % 7) {
                case 0: System.out.println("Today's day is Tuesday and the future day is Sunday"); break;
                case 1: System.out.println("Today's day is Tuesday and the future day is Monday"); break;
                case 2: System.out.println("Today's day is Tuesday and the future day is Tuesday"); break;
                case 3: System.out.println("Today's day is Tuesday and the future day is Wednesday"); break;
                case 4: System.out.println("Today's day is Tuesday and the future day is Thursday"); break;
                case 5: System.out.println("Today's day is Tuesday and the future day is Friday"); break;
                case 6: System.out.println("Today's day is Tuesday and the future day is Saturday"); break;
            } break;
            case 3:
                switch ((todayDay + ellapsedDay) % 7) {
                case 0: System.out.println("Today's day is Wednesday and the future day is Sunday"); break;
                case 1: System.out.println("Today's day is Wednesday and the future day is Monday"); break;
                case 2: System.out.println("Today's day is Wednesday and the future day is Tuesday"); break;
                case 3: System.out.println("Today's day is Wednesday and the future day is Wednesday"); break;
                case 4: System.out.println("Today's day is Wednesday and the future day is Thursday"); break;
                case 5: System.out.println("Today's day is Wednesday and the future day is Friday"); break;
                case 6: System.out.println("Today's day is Wednesday and the future day is Saturday"); break;
            } break;
            case 4:
                switch ((todayDay + ellapsedDay) % 7) {
                case 0: System.out.println("Today's day is Thursday and the future day is Sunday"); break;
                case 1: System.out.println("Today's day is Thursday and the future day is Monday"); break;
                case 2: System.out.println("Today's day is Thursday and the future day is Tuesday"); break;
                case 3: System.out.println("Today's day is Thursday and the future day is Wednesday"); break;
                case 4: System.out.println("Today's day is Thursday and the future day is Thursday"); break;
                case 5: System.out.println("Today's day is Thursday and the future day is Friday"); break;
                case 6: System.out.println("Today's day is Thursday and the future day is Saturday"); break;
            } break;
            case 5:
                switch ((todayDay + ellapsedDay) % 7) {
                case 0: System.out.println("Today's day is Friday and the future day is Sunday"); break;
                case 1: System.out.println("Today's day is Friday and the future day is Monday"); break;
                case 2: System.out.println("Today's day is Friday and the future day is Tuesday"); break;
                case 3: System.out.println("Today's day is Friday and the future day is Wednesday"); break;
                case 4: System.out.println("Today's day is Friday and the future day is Thursday"); break;
                case 5: System.out.println("Today's day is Friday and the future day is Friday"); break;
                case 6: System.out.println("Today's day is Friday and the future day is Saturday"); break;
            } break;
            case 6:
                switch ((todayDay + ellapsedDay) % 7) {
                case 0: System.out.println("Today's day is Saturday and the future day is Sunday"); break;
                case 1: System.out.println("Today's day is Saturday and the future day is Monday"); break;
                case 2: System.out.println("Today's day is Saturday and the future day is Tuesday"); break;
                case 3: System.out.println("Today's day is Saturday and the future day is Wednesday"); break;
                case 4: System.out.println("Today's day is Saturday and the future day is Thursday"); break;
                case 5: System.out.println("Today's day is Saturday and the future day is Friday"); break;
                case 6: System.out.println("Today's day is Satruday and the future day is Saturday"); break;
            } break;
        }
    }
}