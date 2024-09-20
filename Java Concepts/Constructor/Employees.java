class Address {
    String city, state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // Copy Constructor
    Address(Address other) {
        this.city = other.city;
        this.state = other.state;
    }
}

class Employees {
    String name;
    Address address;

    Employees(String name, Address address) {
        this.name = name;
        this.address = new Address(address); 
    }

    // Copy Constructor
    Employees(Employees other) {
        this.name = other.name;
        this.address = new Address(other.address); 
    }

    void display() {
        System.out.println("Name: " + name + ", City: " + address.city + ", State: " + address.state);
    }

    public static void main(String[] args) {
        Address address = new Address("New York", "NY");

        Employees emp1 = new Employees("John", address);
        Employees emp2 = new Employees(emp1);

        address.city = "Los Angeles";  

        emp1.display();  
        emp2.display();  
    }
}
