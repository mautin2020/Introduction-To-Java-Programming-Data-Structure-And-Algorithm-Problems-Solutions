/*5.6 (Conversion from miles to kilometers) Write a program that displays the
        following two tables side by side:
 */
public class MilesToKilometersDouble {
    public static void main(String[] args) {
        // create a constant for milestokilometers equivalent
        final double MilesToKilometersEquivalent = 1.609;

        // create heading
        System.out.printf("%-2s %14s %4s %12s %9s\n", "Miles", "Kilometers", "|", "Kilometers", "Miles");

        for(int milesToKmStartPoint = 1, KmToMilesStartPoint = 20; milesToKmStartPoint <=10 && KmToMilesStartPoint <= 65; milesToKmStartPoint++, KmToMilesStartPoint +=5)
            System.out.printf("%-3d %12.3f %8s %4d %18.3f\n", milesToKmStartPoint,
                    milesToKmStartPoint * MilesToKilometersEquivalent, "|", KmToMilesStartPoint,
                    KmToMilesStartPoint / MilesToKilometersEquivalent);
    }
}