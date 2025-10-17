import java.util.Scanner;
public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Menü gösterimi
        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Please choose a drink from the menu below:");
        System.out.println("A -> Americano -> $3.00");
        System.out.println("C -> Cappuccino -> $3.75");
        System.out.println("L -> Latte -> $4.00");
        System.out.println("E -> Espresso -> $2.50");
        System.out.print("Enter your choice (A, C, L, E): ");
        // Kullanıcıdan seçim alma
        String choice = scanner.nextLine().toUpperCase();
        // Seçime göre fiyat yazdırma
        switch (choice) {
            case "A":
                System.out.println("Americano costs $3.00");
                break;
            case "C":
                System.out.println("Cappuccino costs $3.75");
                break;
            case "L":
                System.out.println("Latte costs $4.00");
                break;
            case "E":
                System.out.println("Espresso costs $2.50");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        scanner.close();
    }
}