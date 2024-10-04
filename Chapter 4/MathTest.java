public class MathTest
    {
    public static void main(String[] args)
        {
        double num1 = 37.0; 
        double angle = -1.57; 
        double random = Math.random() * 100;

        System.out.println("SQRT: " + Math.sqrt(num1));
        System.out.println("SIN: " + Math.sin(angle));
        System.out.println("COS: " + Math.cos(angle));
        System.out.println("FLOOR: " + Math.floor(22.7));
        System.out.println("CEIL: " + Math.ceil(22.7));
        System.out.println("ROUND: " + Math.round(22.7));
        System.out.println("MAX: " + Math.max(71, 68));
        System.out.println("MIN: " + Math.min(71, 68));
        System.out.println("RANDOM: " + random);
    }
}
