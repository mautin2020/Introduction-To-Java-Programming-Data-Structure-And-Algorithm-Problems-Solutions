import java.util.Scanner;

public class CheckSubstring{
    public static void main(String[] args){
        // create new Scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter string s1: ");
        String s1 = input.next();

        System.out.print("Enter string s2: ");
        String s2 = input.next();

        boolean hasSubString = s1.contains(s2);
        System.out.println((hasSubString) ? s1 + " is a substring of " + s2 : s1 + " is not a substring of " + s2);
    }
}