import java.util.Scanner;

public class EvenOddDigitCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: A number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int evenCount = 0, oddCount = 0;  // Variables to count even and odd digits

        // Iterate through each digit of the number
        while (num != 0) {
            int digit = num % 10;  // Extract the last digit

            // Check if the digit is even or odd
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            
            num = num / 10;  // Remove the last digit
        }

        // Output the counts
        System.out.println("Even digit count: " + evenCount);
        System.out.println("Odd digit count: " + oddCount);
    }
}