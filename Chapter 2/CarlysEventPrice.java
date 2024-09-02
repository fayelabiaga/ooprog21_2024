import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int perguest = 35;
        int largeevent = 50;

        System.out.println("************************************************");
        System.out.println("* Carly's makes the food that makes it a party.  *");
        System.out.println("************************************************");

        System.out.print("Enter number of guests: ");
        int guests = scanner.nextInt();
        int totalPrice = guests * perguest;

        System.out.printf("Number of guests: %d%nPrice per guest: $%d%nTotal price: $%d%n", guests, perguest, totalPrice);
        System.out.printf("Large event: %b%n", guests >= largeevent);

    }
}