import java.util.*;
import java.security.SecureRandom;


public  class CAI1 {
	
	static SecureRandom random = new SecureRandom();
	static Scanner scnr = new Scanner(System.in);
	
	public static void main (String[] args) {
		
	quiz();
	
	
	
	
	}
	public static void quiz() {
		int val1 = random.nextInt(10);
		int val2 = random.nextInt(10);
		askQuestion(val1, val2);
	}
    public static void askQuestion(int val1, int val2) {
    	System.out.printf("How much is %d times %d?\n", val1, val2);
    	readResponse(val1, val2);
    }
    public static void readResponse(int val1, int val2) {
    	int answer = val1 * val2;
    	int input = scnr.nextInt();
    	isAnswerCorrect(answer, input, val1 , val2);
    }
    public static void isAnswerCorrect(int answer, int input, int val1, int val2) {
    	if (answer == input) {
    		displayCorrectResponse();
    	}else {
    		displayIncorrectResponse(val1, val2);
    	}
    }
    public static void displayCorrectResponse() {
    	System.out.println("Very Good!");
    }
    public static void displayIncorrectResponse(int val1, int val2) {
    	System.out.println("No. Please try again.");
    	askQuestion(val1, val2);
    }

}
