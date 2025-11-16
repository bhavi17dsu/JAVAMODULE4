import java.util.Scanner;
class Transport {
    void move() {
        System.out.println("The vehicle is moving.");
    }
}
class Bus extends Transport {
    void carryPassengers(int count) {
        System.out.println("Bus is carrying " + count + " passengers.");
    }
}
class Truck extends Transport {
    void carryGoods(String type) {
        System.out.println("Truck is carrying goods: " + type);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of passengers: ");
        int passengers = sc.nextInt();
        sc.nextLine();
        Bus b = new Bus();
        b.move();
        b.carryPassengers(passengers);
        System.out.println("--------------------------------");
        System.out.print("Enter type of goods: ");
        String goods = sc.nextLine();
        Truck t = new Truck();
        t.move();
        t.carryGoods(goods);
        sc.close();
    }
}
