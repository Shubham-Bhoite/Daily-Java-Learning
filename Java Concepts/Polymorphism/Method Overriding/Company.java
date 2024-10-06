class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    @Override
    public void work() { 
        System.out.println("Manager is managing the team");
    }
}

class Developer extends Employee {
    @Override
    protected void work() { 
        System.out.println("Developer is writing code");
    }
}

public class Company {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee manager = new Manager();
        Employee dev = new Developer();

        emp.work();      
        manager.work();  
        dev.work();      
    }
}
