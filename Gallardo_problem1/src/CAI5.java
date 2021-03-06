    import java.security.SecureRandom;
	import java.util.Scanner;

	public class CAI5 {

	static SecureRandom random = new SecureRandom();
	static Scanner scnr = new Scanner(System.in);
	static int correct = 0;
	static int incorrect = 0;
	static int count = 0;
	static int n = 0;
	static int a = 0;
	static int y = 0;
	static int z = 0;

	public static void main (String[] args) {

	quiz();




	}
	public static void quiz() {
		if (a == 0) {
			a++;
			readDifficulty();
			readProblemType();
		}
		if (y == 5) {
			y = 1 + random.nextInt(4);
			z = 5;
		}
		generateQuestionArgument();	
		
	}
	public static void readDifficulty() {
		System.out.println("Please enter the level number of difficulty that you would like to answer");
		System.out.println("1-Numbers from 0 to 9(inclusive)");
		System.out.println("2-Numbers from 0 to 99(inclusive)");
		System.out.println("3-Numbers from 0 to 999(inclusive)");
		System.out.println("4-Numbers from 0 to 9999(inclusive)");
		n = scnr.nextInt();
	}
	public static void readProblemType() {
		System.out.println("Select the number option that you would like to do");
		System.out.println("1- Addition\n2- Multiplication\n3- Subtraction\n4- division\n5- Random mix");
		y = scnr.nextInt();
		
		
	}
	public static void generateQuestionArgument() {
		int val1 = 0;
		int val2 = 0;
		if (n == 1) {
			 val1 = random.nextInt(10);
		     val2 = random.nextInt(10);
		}else if (n == 2) {
			val1 = random.nextInt(100);
		     val2 = random.nextInt(100);
		}else if (n == 3) {
			val1 = random.nextInt(1000);
		     val2 = random.nextInt(1000);
		}else if(n == 4) {
			val1 = random.nextInt(10000);
		     val2 = random.nextInt(10000);
		}else {
			System.out.println("Your input for level is not valid, please try again");
			readDifficulty();
		}
		if (y == 4) {
			if(val2 == 0) {
				generateQuestionArgument();
			}
		}
		askQuestion(val1, val2);
	}
	public static void askQuestion(int val1, int val2) {
		switch(y) {
		case 1:
			System.out.printf("How much is %d plus %d?\n", val1, val2);
			break;
		case 2:
			System.out.printf("How much is %d times %d?\n", val1, val2);
			break;
		case 3:
			System.out.printf("How much is %d minus %d?\n", val1, val2);
			break;
		case 4:
			System.out.printf("How much is %d divided by %d?\n", val1, val2);
			break;
		}
		readResponse(val1, val2);
	}
	public static void readResponse(int val1, int val2) {
		
		int answer = 0;
		switch(y) {
		case 1:
			 answer = val1 + val2;
			break;
		case 2:
		     answer = val1 * val2;
			break;
		case 3:
		     answer = val1 - val2;
			break;
		case 4:
		     answer = val1 / val2;
			break;
		}
		
		
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
			if ( z == 5) {
				y = 5;
			}
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
			  System.out.println("Don�t give up!");
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
			if ( z == 5) {
				y = 5;
			}
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
	 System.out.println("Would you like to solve a new set of problems?(yes/no)");
	 String nSet = scnr.next();
	 int x = nSet.compareToIgnoreCase("yes");
	 if (x == 0) {
		 a = 0;
		 count = 0;
		 correct = 0;
		 incorrect = 0;
		 y = 0;
		 z = 0;
		 n = 0;
		 quiz();
	 }
    return;
	}



	}



