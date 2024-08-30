public class Warmup {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday) return false;
        return true;
 } 

    public static void main(String[] args) {
        Warmup warmup = new Warmup();
        
        System.out.println(warmup.sleepIn(false, false)); 
        System.out.println(warmup.sleepIn(true, false));  
        System.out.println(warmup.sleepIn(false, false));      
    }
}

    
