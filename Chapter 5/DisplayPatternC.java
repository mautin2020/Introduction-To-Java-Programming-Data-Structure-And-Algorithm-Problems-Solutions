/*5.18 (Display four patterns using loops) Use nested loops that display the following
        patterns in four separate programs:

 */
public class DisplayPatternC {
    public static void main(String[] args) {
        for(int row = 1; row <= 6; row++){
            // create a loop for adding spaces
            for(int s = 6 - row; s >= 1; s--){
                System.out.print("  ");
            }
            for(int number = 1; number <= row; number++){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}