import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        
        if (num1 <= num2 && num2 <= num3) {
            System.out.println("Ascending order: " + num1 + " " + num2 + " " + num3);
        } else {
            
            int[] numbers = {num1, num2, num3};
            java.util.Arrays.sort(numbers);
            System.out.println("Descending order: " + numbers[2] + " " + numbers[1] + " " + numbers[0]);
        }
        
    }
}
