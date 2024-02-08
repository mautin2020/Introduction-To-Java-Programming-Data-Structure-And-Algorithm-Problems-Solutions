public class ClassExample{
    public static void main(String[] args) {
        for(int row = 1; row <= 9; row++){
            if(row <= 5){
                for(int space = 5 - row; space >= 1; space--){
                    System.out.print("  ");
                }
                for(int alpha = 1; alpha <= row; alpha++){
                    System.out.print("A ");
                }
                for(int alpha = 2; alpha <= row; alpha++){
                    System.out.print("A ");
                }
                System.out.println();
            }
            else{
                for(int space = 4; space >= 1; space--){
                    System.out.print("  ");
                }
                for(int alpha = 4; alpha <= 4; alpha++){
                    System.out.print("A ");
                }
                for(int alpha = 3; alpha <= 3; alpha++){
                    System.out.print("A ");
                }
                System.out.println();
            }
        }
    }
}