import java.util.Scanner;

public class CountNumberOfDigitsInNumber {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		System.out.println("Number is="+number);
		int count=0;
		
		while(number!=0)
		{
			//int digit=number%10;
			number=number/10;
			count++;
			
		}
		
		System.out.println("Number of digits="+count);
		
		
	}

}
