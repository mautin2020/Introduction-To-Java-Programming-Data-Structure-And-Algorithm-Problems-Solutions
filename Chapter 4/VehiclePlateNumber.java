// (Generate vehicle plate numbers) Assume that a vehicle plate number consists
// of three uppercase letters followed by four digits. Write a program to generate a
// plate number
public class VehiclePlateNumber {
    public static void main(String[] args){
        
        // generate three uppercase alphabet
        int randA = 65 + (int) (Math.random() * 26);
        int randB = 65 + (int) (Math.random() * 26);
        int randC = 65 + (int) (Math.random() * 26);

        // generate three integers
        int number = (int)(Math.random() * 1000);
        System.out.println("The Plate number generated is " + (char)(randA) + (char)(randB) + (char)(randC) + "-" + number);
    }
}