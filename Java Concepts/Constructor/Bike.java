class Bike {
    
    String brand;
    int maxSpeed;

    
    Bike(String b, int s) {
        brand = b;
        maxSpeed = s;
    }

   
    void displayDetails() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Maximum Speed: " + maxSpeed + " km/h");
    }

    public static void main(String[] args) {
        
        
        Bike bike1 = new Bike("Yamaha", 180);
        Bike bike2 = new Bike("Honda", 150);
        
    
        bike1.displayDetails();
        bike2.displayDetails();
    }
}
