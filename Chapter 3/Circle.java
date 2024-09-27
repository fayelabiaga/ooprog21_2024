public class Circle {
    private double radius;

    public void setRadius(double radius) {
       this.radius = radius;
       }
       double getRadius() {
       return 1 * radius;
       }
       
       double getDiameter(){
       return 2 * radius;
        }
       
        double getArea() {
        return Math.PI * radius * radius;
    }
}

 class TestCircle {
    public static void main(String[] args) {
        Circle a = new Circle();
        Circle b = new Circle();

        a.setRadius(3);
        System.out.println("Radius of the first circle: " + a.getRadius());
        System.out.println("Diameter of the first circle: " + a.getDiameter());
        System.out.println("Area of the first circle: " + a.getArea());
        
        b.setRadius(20);
        System.out.println("Radius of the second circle: " + b.getRadius());
        System.out.println("Diameter of the second circle: " + b.getDiameter());
        System.out.println("Area of the second circle: " + b.getArea());
    }
}