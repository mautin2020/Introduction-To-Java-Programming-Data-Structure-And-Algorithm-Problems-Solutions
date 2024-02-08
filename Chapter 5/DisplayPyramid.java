/**5.17 (Display pyramid) Write a program that prompts the user to enter
        an integer from 1 to 15 and displays a pyramid, as presented in
        the following sample run:
 */
import java.util.Scanner;

public class DisplayPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of lines between 1 - 15: ");

        int numberOfLines = input.nextInt();

        // display pyramid
        for(int rows = 1; rows <= numberOfLines; rows++){
            // create spaces in each rows
            for(int s = numberOfLines - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            // create descending number in each row
            for(int l = rows; l >= 2; l--) {
                System.out.print(l + " ");
            }
            // create ascending number in each row
            for(int r = 1; r <= rows; r++) {
                System.out.print(r + " ");
            }
            // End line
            System.out.println();
        }
    }
}