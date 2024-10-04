import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Blood Type: ");
        String bloodType = input.nextLine();
        
        System.out.print("Enter Rh Factor: ");
        String rhFactor = input.nextLine();
        
        BloodData bd = new BloodData(bloodType, rhFactor);
        
        bd.displayBloodInfo();
    
    }
}