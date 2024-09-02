import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hourlyrate = 40;
        int additionalminuterate= 1;
        int minutesinhour = 60;

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S    Sammy's makes it fun in the sun.      S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        System.out.print("Enter minutes rented: ");
        int totalMinutes = scanner.nextInt();
        int hours = totalMinutes / minutesinhour;
        int extraMinutes = totalMinutes % minutesinhour;
        int totalPrice = hours * hourlyrate + extraMinutes * additionalminuterate;

        System.out.println("Hours: %d%nAdditional Minutes: %d%nTotal Price: $%d%n", hours, extraMinutes, totalPrice);

    }
}