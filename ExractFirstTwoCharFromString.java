

public class ExractFirstTwoCharFromString {
	
	public static void main(String[] args) {
	     
        String str="My name is Snehal Suhas Patil and I am shree";
        String allString[]=str.split(" ");
        for(int i=0;i< allString.length;i++){
            if(allString[i].length()>=2)
            {
            System.out.print(allString[i].substring(0,2)+" ");
            }
            else{
            System.out.print(allString[i]+" ");
            }
        }
       
    }

}
