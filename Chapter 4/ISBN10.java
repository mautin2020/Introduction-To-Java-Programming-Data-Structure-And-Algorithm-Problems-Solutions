import java.util.Scanner;

public class ISBN10{
    public static void main(String[] args){
        // create new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN number ");
        
        String d1 = input.next();
        String d2 = input.next();
        String d3 = input.next();
        String d4 = input.next();
        String d5 = input.next();
        String d6 = input.next();
        String d7 = input.next();
        String d8 = input.next();
        String d9 = input.next();

        char digit1 = d1.charAt(0);
        char digit2 = d2.charAt(0);
        char digit3 = d3.charAt(0);
        char digit4 = d4.charAt(0);
        char digit5 = d5.charAt(0);
        char digit6 = d6.charAt(0);
        char digit7 = d7.charAt(0);
        char digit8 = d8.charAt(0);
        char digit9 = d9.charAt(0);

        int ISBN = ((digit1 * 1) + (digit2 * 2) + (digit3 * 3) + (digit4 * 4) + (digit5 * 5) + (digit6 * 6) + (digit7 * 7) + (digit8 * 8) + (digit9 * 9))%11;
        if(ISBN == 10) 
            System.out.println("The ISBN-10 Number is " + digit1+digit2+digit3+digit4+digit5+digit6+digit7+digit8+digit9+"X");
        else
            System.out.println("The ISBN-10 Number is " + digit1+digit2+digit3+digit4+digit5+digit6+digit7+digit8+digit9+ISBN);
    }
}