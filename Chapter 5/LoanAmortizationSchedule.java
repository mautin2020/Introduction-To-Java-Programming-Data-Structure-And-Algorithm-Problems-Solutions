/**5.22 (Financial application: loan amortization schedule) The monthly
 *  payment for a given loan pays the principal and the interest. The monthly
 *  interest is computed by multiplying the monthly interest rate and the
 *  balance (the remaining principal). The principal paid for the month is
 *  therefore the monthly payment minus the monthly interest. Write a program
 *  that lets the user enter the loan amount, number of years, and interest
 *  rate then displays the amortization schedule for the loan.
 */

import java.util.Scanner;
public class LoanAmortizationSchedule {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter Number of Years: ");
        int numOfYears = input.nextInt();

        System.out.print("Enter Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        // compute monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // compute monthly payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1/Math.pow(1 + monthlyInterestRate, numOfYears * 12));

        // compute totalPayment
        double totalPayment = monthlyPayment * numOfYears * 12;
        double balance = totalPayment;
        double principal;

        // Print the header
        System.out.println("Payment# \t\t Interest \t\t Principal \t\t Balance \t\t");

        for(int i = 1; i <= numOfYears * 12; i++){
            double interest = monthlyInterestRate * balance;
            principal =monthlyPayment - interest;
            balance -= principal;

            System.out.printf("%d\t\t\t\t%4.2f\t\t\t%4.2f\t\t\t%.2f\n", i, interest, principal, balance);
        }
    }
}
