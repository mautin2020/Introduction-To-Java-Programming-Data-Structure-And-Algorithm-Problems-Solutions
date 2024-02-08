/** 5.12 (Find the smallest n such that n^2  12,000) Use a while loop to find
        the smallest integer n such that n2
        is greater than 12,000.
 */
public class SmallestN {
    public static void main(String[] args) {
        int n = 0;
        while(Math.pow(n, 2) <= 12000)
            n++;

        System.out.println("The smallest n such that n^2 is greater than 12,000 is: " + n);
    }
}