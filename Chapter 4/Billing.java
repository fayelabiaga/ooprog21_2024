public class Billing
{
   public static void main(String[] args) 
   {
        computeBill(23.2);                         
        computeBill(48.80, 1);                      
        computeBill(26.1, 3, 9);                  
 }
       public static void computeBill(double price) {
        double total = price + (price * 0.08); 
        System.out.println("The total price for the bill is: $" + total);
    }
    
      public static void computeBill(double price, int quantity) {
        double total = (price * quantity) + (price * quantity * 0.08);  
        System.out.println("The total price for the bill is: $" + total);
    }

      public static void computeBill(double price, int quantity, int couponDiscount) {
        double discountAmount = price * quantity * couponDiscount / 100.0;
        double total = (price * quantity - discountAmount) + ((price * quantity - discountAmount) * 0.08); 
        System.out.println("The total price for the bill is: $" + total);
    }
}