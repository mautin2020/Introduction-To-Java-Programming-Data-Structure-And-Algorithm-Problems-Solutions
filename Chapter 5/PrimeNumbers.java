/*5.20 (Display prime numbers between 2 and 1,000) Modify the program given in Listing
        5.15 to display all the prime numbers between 2 and 1,000, inclusive. Display eight
        prime numbers per line. Numbers are separated by exactly one space.

 */

public class PrimeNumbers {
    public static void main(String[] args) {

        // create number of prime and number per line as a constant
        final int NUMBER_PER_LINE = 8;

        // initialize the number to 2 and count to zero
        int number = 2, count = 0;

        System.out.println("The first 1,000 prime numbers are \n");

        while (number <= 1000) {
            boolean isPrime = true; // is the current number a prime number?

            for(int divisor = 2; divisor <= number / 2; divisor++){
                if(number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                count++;

                if(count % NUMBER_PER_LINE ==0){
                    System.out.println(number + " ");
                } else
                    System.out.print(number + " ");
            }
            number++;
        }
    }
}