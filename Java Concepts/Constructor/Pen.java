class Pen {
    String color;
    String brand;

    Pen(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    // Copy Constructor
    Pen(Pen other) {
        this.color = other.color;
        this.brand = other.brand;
    }

    void display() {
        System.out.println("Color: " + color + ", Brand: " + brand);
    }

    public static void main(String[] args) {
      
        Pen pen1 = new Pen("Blue", "Pilot");
        Pen pen2 = new Pen(pen1);

        pen1.display(); 
        pen2.display(); 
    }
}
