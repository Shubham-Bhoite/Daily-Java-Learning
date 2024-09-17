class School {

    String name;
    int totalStudents;

    
    School(String n, int s) {
        name = n;
        totalStudents = s;
    }

    
    void displayDetails() {
        System.out.println("School Name: " + name);
        System.out.println("Total Students: " + totalStudents);
    }

    public static void main(String[] args) {
        
        School school1 = new School("Green Valley High", 1200);
        School school2 = new School("Sunrise Academy", 800);
        
        school1.displayDetails();
        school2.displayDetails();
    }
}
