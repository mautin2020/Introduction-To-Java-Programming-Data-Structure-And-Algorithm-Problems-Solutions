package com.mycompany.exercise_2;
import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[] args) {
        
        // allow user to enter number of years
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        double numberOfYears = input.nextInt();
        
        double birthRateInSeconds = 7.0;
        double deathRateInSeconds = 13.0;
        double immigrantRateInSeconds = 45.0;
        
        double secondsInYear = 60 * 60 * 24 * 365;
        double currentPopulation = 312032486;
        
        double numBirth = secondsInYear / birthRateInSeconds;
        double numDeath = secondsInYear / deathRateInSeconds;
        double numImmigrant = secondsInYear / immigrantRateInSeconds;
        
        for (int i = 1; i <= numberOfYears; i++) {
            currentPopulation += numBirth + numImmigrant - numDeath;
        }
        
         System.out.println("The population in " + (int)numberOfYears + " years is " + (int)currentPopulation);
    }
}
