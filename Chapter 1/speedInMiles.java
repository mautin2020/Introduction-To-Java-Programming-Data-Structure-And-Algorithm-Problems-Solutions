public class speedInMiles {
    public static void main(String[] args) {
        double kilometer = 14.0;
        double miles = kilometer / 1.6;
        double rate = (45.5 * 60 + 30) / 3600;
        double speedInMiles = miles / rate;
        
        System.out.print("Average Speed In Miles = ");
        System.out.println(speedInMiles);
    }
}
