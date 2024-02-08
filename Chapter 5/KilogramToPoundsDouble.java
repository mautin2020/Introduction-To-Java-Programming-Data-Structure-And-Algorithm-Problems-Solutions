/*5.5 (Conversion from kilograms to pounds and pounds to kilograms)
        Write a program that displays the
        following two tables side by side:
 */
public class KilogramToPoundsDouble {
    public static void main(String[] args) {
        final double KILOGRAMTOPOUNDS = 2.2;

        // create heading
        System.out.printf("%-2s %8s %4s %8s %12s\n", "Kilograms", "Pounds", "|", "Pounds", "Kilograms");

        for(int kgToPoundStartPoint = 1, poundToKgStartPoint = 20;
            kgToPoundStartPoint < 200 && poundToKgStartPoint < 520;
            kgToPoundStartPoint +=2, poundToKgStartPoint +=5)
            System.out.printf("%-3d %13.1f %5s %4d %12.1f\n", kgToPoundStartPoint,
                    kgToPoundStartPoint * KILOGRAMTOPOUNDS, "|", poundToKgStartPoint,
                    poundToKgStartPoint / KILOGRAMTOPOUNDS);
    }
}