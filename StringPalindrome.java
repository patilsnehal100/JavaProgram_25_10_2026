import java.util.Scanner;

public class StringPalindrome {

public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String:");
		String inputString=scanner.next();
		System.out.println("User input string="+inputString);
		String original=inputString;
		String reverseString="";
		for(int i=inputString.length()-1;i>=0;i--)
		{
			reverseString=reverseString +inputString.charAt(i);
		}
		
		System.out.println(reverseString);
    
   

    if(original.equals(reverseString))
    {
    	System.out.println("String are pallindrome");
    }
    else {
    	System.out.println("String are not pallindrome");
    }
    
  }

}
