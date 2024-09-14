// Java Example of a Parameterized Constructor 
class Circle {
    
    double radius;

    // Parameterized Constructor
    Circle(double r) {
        radius = r;  
    }

    
    double calculateArea() {
        return Math.PI * radius * radius;  // Area: πr²
    }

    
    double calculateCircumference() {
        return 2 * Math.PI * radius;  // Circumference: 2πr
    }

    public static void main(String[] args) {
        
        Circle circle1 = new Circle(5.0);  
        
        System.out.println("Area of the Circle: " + circle1.calculateArea());
        System.out.println("Circumference of the Circle: " + circle1.calculateCircumference());
    }
}
