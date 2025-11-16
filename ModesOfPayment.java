import java.util.Scanner;
class Payment {
    void pay(double amount) {
        System.out.println("Processing payment of ₹" + amount + "...");
    }
}
class CreditCardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
class UPIPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}
class NetBankingPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Net Banking.");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to pay: ");
        double amount = sc.nextDouble();
        System.out.println("\nSelect Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();
        Payment p; // parent reference (polymorphism)
        switch (choice) {
            case 1:
                p = new CreditCardPayment();
                break;
            case 2:
                p = new UPIPayment();
                break;
            case 3:
                p = new NetBankingPayment();
                break;
            default:
                System.out.println("Invalid choice!");
                return; // exit
        }
        System.out.println();
        p.pay(amount); // polymorphic call
        sc.close();
    }
}
