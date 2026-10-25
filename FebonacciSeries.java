import java.util.Scanner;

public class FebonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of 1st number");
		int firstNumber=sc.nextInt();
		
		System.out.println("Enter the value of 2nd number");
		int secondNumber=sc.nextInt();
		
		int n=10;
		
		for(int i=1;i<=n;i++) {
			
			System.out.print(firstNumber+" ");
			int sum=firstNumber +secondNumber;
			firstNumber=secondNumber;
			secondNumber=sum;
			//System.out.println(secondNumber);
		}
		
		
		
		

	}

}
