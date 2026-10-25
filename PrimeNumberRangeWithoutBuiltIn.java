
import java.util.Scanner;

public class PrimeNumberRangeWithoutBuiltIn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: Starting and ending range
        System.out.print("Enter the starting range: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the ending range: ");
        int end = sc.nextInt();
        
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Method to check if a number is prime without using Math.sqrt()
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        
        // Check divisibility up to num / 2
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
