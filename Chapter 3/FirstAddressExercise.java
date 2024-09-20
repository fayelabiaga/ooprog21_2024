public class FirstAddressExercise
{
    public static void main(String[] args) 
    {
        String companyName = "Oppo Company";
        String address1 = "20172 SW Birch St";
        String address2 = "Newport Beach, CA 92660";
        String companyN2 = "Company: Oppo";
        
        displayAddress(companyName, address1, address2, companyN2 );
    }

    public static void displayAddress(String companyName, String address1, String address2, String companyN2) 
    {
        System.out.println(companyName);
        System.out.println(address1);
        System.out.println(address2);
        System.out.println(companyN2);
    }
}