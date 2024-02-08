/*5.15 (Display the ASCII character table) Write a program that prints the characters in
        the ASCII character table from ! to ~. Display 10 characters per line. The ASCII
        table is given in Appendix B. Characters are separated by exactly one space.

 */

public class ASCIICharacter {
    public static void main(String[] args) {

        // initiate the count to zero and get the total count expected
        int count = 0, totalCharacter = 126 - 33;

        // set number of character on each row
        final int NUMBER_OF_LINE = 10;

        while (count < totalCharacter ) {
            for(char ascii = 33; ascii <= 126; ascii++)
            {
                count++;
                if(count % NUMBER_OF_LINE == 0)
                    System.out.println(ascii);
                else
                    System.out.print(ascii + " ");
            }
        }
    }
}