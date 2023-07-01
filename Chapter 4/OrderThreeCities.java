// (Order three cities) Write a program that prompts the user to enter three cities
// and displays them in ascending order
import java.util.Scanner;

public class OrderThreeCities{
    public static void main(String[] args){
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first city: ");
        String firstCity = input.nextLine();

        System.out.print("Enter the second city: ");
        String secondCity = input.nextLine();

        System.out.print("Enter the third city: ");
        String thirdCity = input.nextLine();

        if(firstCity.compareTo(secondCity) < 0 && secondCity.compareTo(thirdCity) < 0)
            System.out.println("The cities in alphabetical order are " + firstCity + " " + secondCity + " " + " " + thirdCity);
        else 
            System.out.println("The cities in alphabetical order are " + thirdCity + " " + secondCity + " " + firstCity);           
    }
}