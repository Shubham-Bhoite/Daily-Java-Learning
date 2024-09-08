class Person {
    String name;
    int age;

    // Constructor
    public Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person1 = new Person("John", 25);

        // Calling the method to display info
        person1.displayInfo();
    }
}


    

