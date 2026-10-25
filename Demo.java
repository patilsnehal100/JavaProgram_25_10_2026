import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the integer value:");
        int a = sc.nextInt();
        
        // Consume the leftover newline
        sc.nextLine();
        
        System.out.println("Value of a = " + a);
        
        System.out.println("Enter the string value:");
        String name = sc.nextLine();
        
        System.out.println("Value of name = " + name);
    }
}