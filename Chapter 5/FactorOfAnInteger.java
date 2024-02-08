/*5.16 (Find the factors of an integer) Write a program that reads an
        integer and displays all its smallest factors in an increasing
        order. For example, if the input integer is 120, the output
        should be as follows: 2, 2, 2, 3, 5.
 */
import  java.util.Scanner;

public class FactorOfAnInteger {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for(int i = 2; number / i != 1;){
            if(number % i == 0){
                System.out.print(i + " ");
                number /= i;
            } else
                i++;
        }
        System.out.print(number);
    }
}