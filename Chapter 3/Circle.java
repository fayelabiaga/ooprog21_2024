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

