class City {
    String name;
    String state;

    // No-argument constructor
    public City() {
        name = "Mumbai";
        state = "Maharashtra";
    }

    void display() {
        System.out.println("City: " + name + ", State: " + state);
    }

    public static void main(String[] args) {
        // Creating an object using the no-argument constructor
        City myCity = new City();
        myCity.display(); // Output: City: Mumbai, State: Maharashtra
    }
}
