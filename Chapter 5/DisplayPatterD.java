/*5.18 (Display four patterns using loops) Use nested loops that display the following
        patterns in four separate programs:
 */
public class DisplayPatterD {
    public static void main(String[] args){
        for(int i = 6; i >= 1; i--) {
            // create loop for adding space
            for(int s = 6 - i; s >= 1; s--){
                System.out.print("  ");
            }
            for(int number = 1; number <= i; number++)
                System.out.print(number + " ");
            System.out.println();
        }
    }
}
