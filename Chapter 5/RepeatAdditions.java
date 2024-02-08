/*     (Repeat additions) Listing 5.4, SubtractionQuizLoop.java, generates five
        random subtraction questions. Revise the program to generate 10 random
         addition questions for two integers between 1 and 15.
         Display the correct count and
        test time */
import java.util.Scanner;
public class RepeatAdditions {
    public static void main(String[] args) {
        final  int NUMBER_OF_QUESTION = 10;

        // initiate count and correct count to 0
        int count = 0, correctCount = 0;

        //create starting time
        long starTime = System.currentTimeMillis();

        // create empty string for feedback for each question
        String output = "";

        Scanner input = new Scanner(System.in);

        while(count < NUMBER_OF_QUESTION){
            // create first question
            int additionOne = (int)(Math.random() * 10);
            int additionTwo = (int)(Math.random() * 10);

            System.out.print("What is " + additionOne + " + " + additionTwo + " ? ");
            int answer = input.nextInt();

            //Give feedback for correct answer
            if(additionOne + additionTwo == answer) {
                System.out.println("You are correct ");
                correctCount++;
            }
            else
                System.out.println("Your answer is wrong.\n" +
                        additionOne + " + " + additionTwo + " should be " + (additionOne + additionTwo));

            // increase question count
            count++;

            output += "\n" + additionOne + "+" + additionTwo + "=" + answer + ((additionOne + additionTwo == answer) ?
                    " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - starTime;
        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n"
                + output);
    }
}