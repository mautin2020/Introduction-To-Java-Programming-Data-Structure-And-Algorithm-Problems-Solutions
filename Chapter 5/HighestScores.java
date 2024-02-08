/**
 * 5.8 (Find the highest score) Write a program that prompts the user to enter the number of
        students and each student’s name and score, and finally displays the name
        of the student with the highest score. Use the next() method in the Scanner
        class to read a name, rather than using the nextLine() method. Assume that the
        number of students is at least 1.
 */
import java.util.Scanner;

public class HighestScores {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of Student: ");
        int numberOfStudent = input.nextInt();

        String inputedName = "";
        int studentScore = 0;

        int highScore = 0;
        String highScoreStudentName = "";

        while(numberOfStudent >= 1) {
            System.out.print("Enter Student Name: ");
            inputedName = input.next();
            System.out.print("Enter Student Score: ");
            studentScore = input.nextInt();
            if(studentScore > highScore){
                highScore = studentScore;
                highScoreStudentName = inputedName;
            }
            numberOfStudent --;
        }
        System.out.println("The Student with highest Score is " + highScoreStudentName);
    }
}