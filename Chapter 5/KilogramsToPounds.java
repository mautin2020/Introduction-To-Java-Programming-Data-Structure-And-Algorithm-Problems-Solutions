/*(Conversion from kilograms to pounds) Write a program that displays the
        following table (note 1 kilogram is 2.2 pounds):
 */
public class KilogramsToPounds {
    public static void main(String[] args){
        // initiate pounds equivalent to pounds
        double kilogramToPounds = 2.2;

        // print the heading
        System.out.printf("%-2s %8s\n", "Kilograms", "Pounds");

        // loop to show the kilograms to pounds conversion
        for(int startPoint = 1; startPoint <= 200; startPoint +=2) {
            System.out.printf("%-3d %12.1f\n", startPoint, startPoint * kilogramToPounds);
        }
    }
}