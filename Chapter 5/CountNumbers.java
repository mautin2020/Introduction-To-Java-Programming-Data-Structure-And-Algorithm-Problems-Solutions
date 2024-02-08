import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer the input ends when it is 0: ");
        int userInput = input.nextInt();

        // initiate positive, negative and total count to 0
        int positiveCount = 0, negativeCount = 0, totalCount = 0;

        double totalSum = 0;

        // check to see if userInput and length is 0;

        if(userInput == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        while (userInput != 0){

            totalSum += userInput;
            totalCount++;

            if(userInput > 0) {
                positiveCount ++;
            }
            else
            {
                negativeCount ++;
            }
            userInput = input.nextInt();
        }
        System.out.println("The number of positives is: " + positiveCount);
        System.out.println("The number of negatives is: " + negativeCount);
        System.out.println("The total: " + totalSum);
        System.out.println("The average count is: " + totalSum / totalCount);
    }
}