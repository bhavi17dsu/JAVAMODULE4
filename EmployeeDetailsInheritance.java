import java.util.Scanner;
class Employee {
    String name;
    double salary;
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    String department;
    void displayManagerInfo() {
        displayInfo(); // from Employee
        System.out.println("Department: " + department);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager m = new Manager();
        System.out.print("Enter Manager Name: ");
        m.name = sc.nextLine();
        System.out.print("Enter Salary: ");
        m.salary = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Enter Department: ");
        m.department = sc.nextLine();
        System.out.println("\n--- Manager Details ---");
        m.displayManagerInfo();
        sc.close();
    }
}
