/**5.9 (Find the two highest scores) Write a program that prompts the user to enter the
        number of students and each student’s name and score, and finally displays the
        student with the highest score and the student with the second-highest score. Use
        the next() method in the Scanner class to read a name rather than using the
        nextLine() method. Assume that the number of students is at least 2.
 */

import java.util.Scanner;

public class TwoHighestScore {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.print("Enter Number of Student: ");
            int numberOfStudent = input.nextInt();

            if(numberOfStudent < 2) {
                System.out.println("The minimum number of student expected is 2 ");
                System.exit(1);
            }

            String inputedName = "", overallHighScoreName = "", secondOverallScoreName = "";
            int studentScore = 0, overallHighScore = 0, secondHighScore = 0;

            while(numberOfStudent >= 1) {
                System.out.print("Enter Student Name: ");
                inputedName = input.next();

                System.out.print("Enter Student Score: ");
                studentScore = input.nextInt();

                if(studentScore > overallHighScore) {
                    secondHighScore = overallHighScore;
                    secondOverallScoreName = overallHighScoreName;

                    overallHighScore = studentScore;
                    overallHighScoreName = inputedName;
                    numberOfStudent--;
                    continue;
                }
                if(studentScore < overallHighScore && studentScore > secondHighScore) {
                    secondHighScore = studentScore;
                    secondOverallScoreName = inputedName;
                }
                numberOfStudent --;
            }
            System.out.println("\nThe Overall-High-Score is " + overallHighScoreName);
            System.out.println("The Second-Overall-High Score is " + secondOverallScoreName);
    }
}