import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter manager name: ");
        String name = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter department: ");
        String dept = sc.nextLine();
        Manager m = new Manager(name, salary, dept);
        System.out.println("\n--- Manager Details ---");
        m.displayInfo();
        sc.close();
    }
}
class Employee {
    String name;
    double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    String department;
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
