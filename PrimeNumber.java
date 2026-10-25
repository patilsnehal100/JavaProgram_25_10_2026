import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();

        if (numberIsPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

        sc.close(); // Closing the scanner to avoid resource leak
    }

    private static boolean numberIsPrime(int num) {
        if (num <= 1) { 
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check divisors from 2 up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { // If divisible, it is not a prime number
                return false;
            }
        }
        return true; // If no divisor is found, it is a prime number
    }
}
