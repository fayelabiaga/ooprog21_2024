public class Warmup {

public boolean sleepIn(boolean weekday, boolean vacation) {

     if (weekday == false && vacation == false) {
        return true;
     }
     else if (weekday == false && vacation == true) { 
        return true;
    }
     else if (weekday == true && vacation == false) {
        return false; 
     } 
     else { 
       return true; 
      }
   }
}

    