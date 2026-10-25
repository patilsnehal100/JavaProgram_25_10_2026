
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int originalNumber=number,result=0;
		int numberOfDigits=String.valueOf(number).length();
		System.out.println("Digits="+numberOfDigits);
		
		while(number!=0) {
			int digit=number%10;
			result=(int) (result+ Math.pow(digit, numberOfDigits));
			number=number/10;
		}
		
		System.out.println("Number is:"+result);
		
		if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        sc.close();
		
	}

}
