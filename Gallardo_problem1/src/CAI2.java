import java.util.*;
import java.security.SecureRandom;

public class CAI2 {
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
    	int right = 1 + random.nextInt(4);
    	switch(right){
    	  case 1:
    		  System.out.println("Very good!");
    		  break;
    	  case 2:
    		  System.out.println("Excellent!");
    		  break;
    	  case 3:
    		  System.out.println("Nice work!");
    		  break;
    	  case 4:
    		  System.out.println("Keep up the good work!");
    		  break;
    	}
    }
    public static void displayIncorrectResponse(int val1, int val2) {
    	int wrong = 1 + random.nextInt(4);
    	switch(wrong){
    	  case 1:
    		  System.out.println("No. Please try again.");
    		  break;
    	  case 2:
    		  System.out.println("Wrong. Try once more.");
    		  break;
    	  case 3:
    		  System.out.println("Don’t give up!");
    		  break;
    	  case 4:
    		  System.out.println("No. Keep trying.");
    		  break;
    	}
    	askQuestion(val1, val2);
    }

}
