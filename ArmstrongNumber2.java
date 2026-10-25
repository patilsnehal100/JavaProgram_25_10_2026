import java.util.Scanner;

public class ArmstrongNumber2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int originalNumber=number;
		int result=0;
		
		int numberOfDigit=countDigitsOfGivenNumber(number);
		System.out.println("Number of Digits="+numberOfDigit);
		
		while(number!=0) {
			int digit=number%10;
			int power=1;
			
			for(int i=0;i<numberOfDigit;i++) {
				power=power*digit;
		    }
		   result=result+power;
		   number=number/10;
		}
		
		if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
		
	}

	private static int countDigitsOfGivenNumber(int number) {
		int count=0;
		while(number!=0)
		{
			number=number/10;
			count++;
		}
		return count;
	}

}
