public class speedInKilometers {
   public static void main(String[] args) {
        double hrs = 1;
        double mins = 40;
        double secs = 35;
        double totaldist = 24;
        double miledist = totaldist * 1.60934;
        
        double convertToMin = hrs * 60 + mins + secs / 60;
        double KPH = 60 * miledist / convertToMin;
        
        System.out.print("Average Speed In Kilometers = ");
        System.out.println(KPH);
    }  
}