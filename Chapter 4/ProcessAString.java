import java.util.Scanner;

public class ProcessAString{
    public static void main(String[] args){
        // create a new scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String newString = input.next();

        System.out.println("The lenght of the string is" + newString.length() + "and the first letter is" + newString.charAt(0));
    }
}