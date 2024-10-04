public class BloodData {
 String bloodtype = "A";
 String rhFactor = "-"; 
 
  public BloodData(String bt, String rh) { 
       bloodtype = bt; 
       rhFactor = rh; 
  }
  
  public void displayBloodInfo() {
      System.out.println("Blood type: " + bloodtype + ", Rh factor: " + rhFactor);
    }
}