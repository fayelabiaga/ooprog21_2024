import java.util.Scanner;

public class Prelim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int count = scanner.nextInt();
        scanner.close();
        printFibonacci(count);
    }

    public static void printFibonacci(int count) {
        int b = 0,
            c = 1;
        for (int i = 0; i < count; i++) {
            System.out.println("fibonacci(" + i + ") = " + b);
            int next = b + c;
            b = b;
            c = next;
        }
    }
}


