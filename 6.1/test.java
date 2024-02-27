// TestShape.java
public class TestShape {
    public static void main(String[] args) {
        Shape circle = new Circle("red", true, 5.0);
        Shape rectangle = new Rectangle("blue", false, 4.0, 6.0);

        System.out.println(circle.toString());
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Perimeter of circle: " + circle.getPerimeter());

        System.out.println(rectangle.toString());
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
    }
}
