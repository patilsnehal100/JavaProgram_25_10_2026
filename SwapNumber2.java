import java.util.Scanner;

public class SwapNumber2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		int temp=0;
		
		System.out.println("Before swapping value of a="+a+ " and value of b="+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swapping value of a=" +a+ " and value of b=" +b);
		System.out.println("After swapping value of a=" +a+ " and value of b=" +b);
		
		

	}

}
