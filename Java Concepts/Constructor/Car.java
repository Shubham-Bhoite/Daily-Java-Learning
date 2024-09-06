
class Car {
    String brand;
    int year;

    // Constructor for the Car class
    public Car(String brandName, int manufactureYear) {
        brand = brandName;
        year = manufactureYear;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        
        Car myCar = new Car("Toyota", 2022);
        myCar.displayCarDetails();
    }
}
