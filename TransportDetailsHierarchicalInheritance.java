import java.util.Scanner;
class Transport {
    void move() {
        System.out.println("Transport is moving...");
    }
}
class Bus extends Transport {
    int passengers;
    void carryPassengers() {
        System.out.println("Bus is carrying " + passengers + " passengers.");
    }
}
class Truck extends Transport {
    double load;
    void carryGoods() {
        System.out.println("Truck is carrying " + load + " tons of goods.");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bus b = new Bus();
        System.out.print("Enter number of passengers in the bus: ");
        b.passengers = sc.nextInt();
        System.out.println("\n--- Bus Details ---");
        b.move();
        b.carryPassengers();
        Truck t = new Truck();
        System.out.print("\nEnter goods load (in tons) for the truck: ");
        t.load = sc.nextDouble();
        System.out.println("\n--- Truck Details ---");
        t.move();
        t.carryGoods();
        sc.close();
    }
}
