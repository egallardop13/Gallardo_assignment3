
import java.util.*;
	import java.security.SecureRandom;
	
public class CAI3 {
	
		static SecureRandom random = new SecureRandom();
		static Scanner scnr = new Scanner(System.in);
		static int correct = 0;
		static int incorrect = 0;
		static int count = 0;
		
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
	    		  correct++;
	    		  count++;
	    		  break;
	    	  case 2:
	    		  System.out.println("Excellent!");
	    		  correct++;
	    		  count++;
	    		  break;
	    	  case 3:
	    		  System.out.println("Nice work!");
	    		  correct++;
	    		  count++;
	    		  break;
	    	  case 4:
	    		  System.out.println("Keep up the good work!");
	    		  correct++;
	    		  count++;
	    		  break;
	    	}
	    	if (count == 10) {
	    		displayCompletionMessage();
	    	}else {
	    	quiz();
	    	}
	    }
	    public static void displayIncorrectResponse(int val1, int val2) {
	    	int wrong = 1 + random.nextInt(4);
	    	switch(wrong){
	    	  case 1:
	    		  System.out.println("No. Please try again.");
	    		  incorrect++;
	    		  count++;
	    		  break;
	    	  case 2:
	    		  System.out.println("Wrong. Try once more.");
	    		  incorrect++;
	    		  count++;
	    		  break;
	    	  case 3:
	    		  System.out.println("Don’t give up!");
	    		  incorrect++;
	    		  count++;
	    		  break;
	    	  case 4:
	    		  System.out.println("No. Keep trying.");
	    		  incorrect++;
	    		  count++;
	    		  break;
	    	}
	    	if (count == 10) {
	    		displayCompletionMessage();
	    	}else {
	    	quiz();
	    	}
	    }
   public static void displayCompletionMessage() {
	   int average = (correct*100) / 10;
	   System.out.println("Your score is "+average);
	   if (average > 75) {
		   System.out.println("Congratulations, you are ready to go to the next level!");
	   }else if (average < 75) {
		   System.out.println("Please ask your teacher for extra help.");
	   }
       
   }
	    
	    
	    
	}

