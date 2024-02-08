/** 5.13 (Find the largest n such that n^3  12,000) Use a while loop to find
 the largest integer n such that n2
 is less than 12,000.
 */
public class LargestN {
    public static void main(String[] args) {
        int n = 0;
        while(Math.pow(n, 3) >= 12000)
            n++;

        System.out.println("The largest n such that n^3 is greater than 12,000 is: " + n);
    }
}