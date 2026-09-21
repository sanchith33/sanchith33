abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }
    @Override
    double area() { return Math.PI * r * r; }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        Shape s = new Circle(2);
        System.out.println(s.area());
    }
