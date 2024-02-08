public class MilesToKilometers {
    public static void main(String[] args)
    {
        // create a constant for milestokilometersequivalent
        final double MilesToKilometersEquivalent = 1.609;

        // create heading
        System.out.printf("%-2s %14s\n", "Miles", "Kilometers");

        //loop to print miles to kilometers for the first 10 integers
        for(int startpoint = 1; startpoint <= 10; startpoint++){
            System.out.printf("%-2d %12.3f\n", startpoint, startpoint * MilesToKilometersEquivalent);
        }
    }
}