import java.util.Scanner;

public class DayOfAMonth {
    public static void main(String[] args) {
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        // prompt user to enter year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // prompt user to enter month
        System.out.print("Enter month name: ");
        String monthName = input.next();

        // create a boolean to check leap year
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        
        System.out.print(monthName + " " + year + " has " );
        if(monthName.equals("Jan") || monthName.equals("Mar") || monthName.equals("May") || monthName.equals("Jul") || monthName.equals("Aug")
            || monthName.equals("Oct") || monthName.equals("Dec")){
                System.out.println("31 " + " days" );
            } else if(monthName.equals("Apr") || monthName.equals("Jun") || monthName.equals("Sep") || monthName.equals("Nov")) {
                System.out.println("30 " + " days");
            } else if (monthName.equals("Feb")) {
                System.out.println(((isLeapYear) ? 29 : 28) + " days");
            } else 
                System.out.println(monthName + "is not a correct month name");


    }
}