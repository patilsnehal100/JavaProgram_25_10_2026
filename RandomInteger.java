import java.util.Random;

public class RandomInteger {
	
           public static void main(String[] args) {
	        Random random = new Random();

	        // Generate a random integer
	        int randomInt = random.nextInt(100); // Generates a number between 0 and 99
	        System.out.println("Random Integer: " + randomInt);

	        // Generate a random double
	        double randomDouble = random.nextDouble(); // Generates a number between 0.0 and 1.0
	        System.out.println("Random Double: " + randomDouble);
	    }
	

}
