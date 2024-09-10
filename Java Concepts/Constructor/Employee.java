class Employee {
    String name;
    double salary;

    // Constructor
    public Employee(String employeeName, double employeeSalary) {
        name = employeeName;
        salary = employeeSalary;
    }

    // Method 
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Alice", 50000);
        emp1.displayInfo();
    }
}
