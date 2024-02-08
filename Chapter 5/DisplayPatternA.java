/*5.18 (Display four patterns using loops) Use nested loops that display the following
        patterns in four separate programs:

 */
public class DisplayPatternA {
    public  static void main(String[] args) {
        for(int row = 1; row <= 6; row++){
            for(int number = 1; number <= row; number++){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
