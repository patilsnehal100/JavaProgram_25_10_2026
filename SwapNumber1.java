import java.util.Scanner;

public class SwapNumber1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		
		System.out.println("Before swapping value of a="+a+ " and value of b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping value of a=" +a+ " and value of b=" +b);
		System.out.println("After swapping value of a=" +a+ " and value of b=" +b);
		

	}

}
