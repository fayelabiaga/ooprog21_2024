import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hourlyRate = 40;
        int additionalMinuteRate = 1;
        int minutesInHour = 60;

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S    Sammy's makes it fun in the sun.      S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        System.out.print("Enter minutes rented: ");
        int totalMinutes = scanner.nextInt();
        int hours = totalMinutes / minutesInHour;
        int extraMinutes = totalMinutes % minutesInHour;
        int totalPrice = hours * hourlyRate + extraMinutes * additionalMinuteRate;

        System.out.println("Hours: " + hours);
        System.out.println("Additional Minutes: " + extraMinutes);
        System.out.println("Total Price: $" + totalPrice);
      
    }
}
