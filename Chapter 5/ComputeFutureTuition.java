/**
 * 5.7 (Financial application: compute future tuition) Suppose the tuition for a
        university is $10,000 this year and increases 5% every year. In one year, the tuition will
        be $10,500. Write a program that displays the tuition in 10 years, and the total
        cost of four years’ worth of tuition starting after the tenth year
 */

public class ComputeFutureTuition {
    public static void main(String[] args) {
        // create variables for tuition fee, year and cost after four year

        int tuitionFee = 10000, year = 1, totalCostAfterFourYears = 0;

        for(year = 1; year <= 10; year++) {
            tuitionFee *= 1.05;
            System.out.println("The tuition fee for year " + year + " is " + tuitionFee);
        }

        for(year = 10; year <= 14; year++)
            totalCostAfterFourYears = tuitionFee *= 1.05;

        System.out.println("\nThe total cost after four years is " + totalCostAfterFourYears);
    }
}