public class Rectangle {
    int length;
    int width;

    // No-argument constructor
    public Rectangle() {
        length = 10;
        width = 5;
    }

    public int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Area: " + rectangle.calculateArea());  // Output: Area: 50
    }
}
