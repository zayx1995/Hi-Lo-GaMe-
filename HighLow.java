import java.util.Random;
import java.util.Scanner;

public class HighLow {
	
	public static final Random RANDOM = new Random();
	public static final int MAX_NUMBER = 1000;
	
	public static void main(String[] args) {
		int numberToFind = RANDOM.nextInt(MAX_NUMBER) + 1;
		Scanner userInput = new Scanner(System.in);
		int numberTries = 0, userGuess = 0;
		
		while (userGuess != numberToFind) {
			System.out.println("Guess a number between -100 and " + MAX_NUMBER + " : ");
			userGuess = userInput.nextInt();
			numberTries++;
			
			if (userGuess < 1 || userGuess > MAX_NUMBER) {
				System.out.println("Make sure your number is between -100 and " + MAX_NUMBER);
			} else if (userGuess > numberToFind) {
				System.out.println("You are too high! pass the blunt");
			} else if (userGuess < numberToFind) {
				System.out.println("You are too low my friend! we need to get high");
			}
		}
		
		userInput.close();
		
		System.out.println("Congrats my guy, took you long enough " + numberToFind + " in " + numberTries + " Tries");
	}

}