public class populationBurea {
    public static void main(String[] args){
        double birthRateInSeconds = 7.0;
        double deathRateInSeconds = 13.0;
        double immigrantRateInSeconds = 45.0;
        
        double secondsInYear = 60 * 60 * 24 * 365;
        double currentPopulation = 312032486;
        
        double numBirth = secondsInYear / birthRateInSeconds;
        double numDeath = secondsInYear / deathRateInSeconds;
        double numImmigrant = secondsInYear / immigrantRateInSeconds;
        
        for (int i = 1; i <= 5; i++) {
            currentPopulation += numBirth + numImmigrant - numDeath;
            System.out.println("Year " + i + " = " + (int)currentPopulation);
        }
    }
}