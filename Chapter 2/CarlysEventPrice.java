import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PER_GUEST = 35;
        final int LARGE_EVENT_THRESHOLD = 50;

        System.out.println("************************************************");
        System.out.println("* Carly's makes the food that makes it a party.  *");
        System.out.println("************************************************");

        System.out.print("Enter number of guests: ");
        int guests = scanner.nextInt();

        int totalPrice = guests * PER_GUEST;
        boolean isLargeEvent = guests >= LARGE_EVENT_THRESHOLD;

            System.out.println("Number of guests: " + guests);
            System.out.println("Price per guest: $" + PER_GUEST);
            System.out.println("Total price: $" + totalPrice);
            System.out.println("Large event: " + isLargeEvent);
        }
    }
