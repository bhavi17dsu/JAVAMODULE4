import java.util.Scanner;
class Transport {
    void deliver() {
        System.out.println("Transport is delivering goods...");
    }
}
class Truck extends Transport {
    @Override
    void deliver() {
        System.out.println("Delivering goods by road using Truck.");
    }
}
class Ship extends Transport {
    @Override
    void deliver() {
        System.out.println("Delivering goods by sea using Ship.");
    }
}
class Airplane extends Transport {
    @Override
    void deliver() {
        System.out.println("Delivering goods by air using Airplane.");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose delivery method:");
        System.out.println("1. Truck");
        System.out.println("2. Ship");
        System.out.println("3. Airplane");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        Transport t;  // polymorphic reference
        switch (choice) {
            case 1:
                t = new Truck();
                break;
            case 2:
                t = new Ship();
                break;
            case 3:
                t = new Airplane();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        System.out.println();
        t.deliver();   // dynamic method dispatch
        sc.close();
    }
}
