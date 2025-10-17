import java.util.Scanner;
public class CheckPrime {
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        
         Handle case for numbers less than or equal to 1
        if (n <= 1) {
            return false;
        }
        // Check divisibility from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Not prime
            }
        }
        return true; // Prime
    }
    public static void main(String[] args) {
        // Create scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Ask the user for a number
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();
        // Call isPrime method and display result
        if (isPrime(number)) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }
        // Close the scanner
        scanner.close();
    }
}