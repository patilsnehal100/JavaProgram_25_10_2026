import java.util.Scanner;

public class PalindromeNumber {

	
        public static void main(String[] args) {

	     Scanner scanner=new Scanner(System.in)	;	
	     System.out.println("Enter the number:");
	     int number=scanner.nextInt();
	     System.out.println(number);
	     int originalNumber=number;
	     
	     int  reverseNumber=0,digit=0;
	      while(number!=0)
	      {
	    	digit= number%10;
	    	reverseNumber=reverseNumber*10+digit;
	    	number=number/10;
	      }
	     
	     System.out.println("Reverse number is:"+reverseNumber);
	     if(originalNumber==reverseNumber)
	     {
	    	 System.out.println("Number is palindrome");
	     }
	     else {
	    	 System.out.println("Number is not palindrome");

	     }
		}

	

}
