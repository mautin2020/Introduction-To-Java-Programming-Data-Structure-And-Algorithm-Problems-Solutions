package com.mycompany.exercise4;
// (Financial application: payroll) Write a program that reads the following information and prints a payroll statement:
// Employee’s name (e.g., Smith)
// Number of hours worked in a week (e.g., 10)
// Hourly pay rate (e.g., 9.75)
// Federal tax withholding rate (e.g., 20%)
// State tax withholding rate (e.g., 9%)

import java.util.Scanner;

public class Payroll{
    public static void main(String[] args){
        // create a new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String employeeName = input.next();

        System.out.print("Enter number of hours worked in a week: ");
        double noOfHourWork = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();

        System.out.print("Enter federal tax witholding rate: ");
        double federalTax = input.nextDouble();

        System.out.print("Enter State tax witholding rate: ");
        double stateTax = input.nextDouble();

        // compute result output
        double grossPay = noOfHourWork * hourlyPayRate;
        double federalWithholding = federalTax * grossPay;
        double stateWithholding = stateTax * grossPay;
        double totalDeduction = federalWithholding + stateWithholding;

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours Worked: " + noOfHourWork);
        System.out.println("Pay rate: $" + hourlyPayRate);
        System.out.printf("Gross pay: $%4.2f\n", grossPay);
        System.out.printf("%30s$%-4.2f%%\n", "Federal withholding (" + federalTax * 100 + ")", federalWithholding);
        System.out.printf("%25s$%-4.2f%%\n", "State Withholding (" + stateTax * 100 + ")", stateWithholding);
        System.out.printf("%16s$%-4.2f%%\n", "Total Deduction:", totalDeduction);
        System.out.println("Net Pay: " + (grossPay - totalDeduction));
    }
}