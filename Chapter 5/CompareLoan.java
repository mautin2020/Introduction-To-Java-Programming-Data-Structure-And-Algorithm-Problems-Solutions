/**5.21 (Financial application: compare loans with various interest
 * rates) Write a program that lets the user enter the loan amount
 * and loan period of years, and displays the monthly and
 * total payments for each interest rate starting from
 * 5% to 8%, with an increment of 1/8.
 */
import java.util.Scanner;

public class CompareLoan {
    public static void main(String[] args){
        // create new scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Loan Amount: "); // prompt user to enter loan amount
        int loanAmount = input.nextInt();

        System.out.print("Enter Number of Years: "); // prompt user to enter number of years
        int numberOfYears = input.nextInt();

        double percentMargin = 8; // set the percent margin

        // print the header
        System.out.printf("%-20s %20s %20s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        for(double percentStart = 5; percentStart <= percentMargin; percentStart += (double) 1/8){
            double interestRate = percentStart / 1200;
            double monthlyPayment = loanAmount * interestRate / (1 - 1/Math.pow(1 + interestRate, numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;

            System.out.printf("%-19.3f %12.2f %24.2f\n", percentStart, monthlyPayment, totalPayment);
        }
    }
}
