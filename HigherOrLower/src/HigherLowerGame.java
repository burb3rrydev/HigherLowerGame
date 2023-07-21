import java.util.Scanner;
import java.util.Random;

public class HigherLowerGame {
	public static void main(String []args) {
	int randomNum = new Random().nextInt(10000);
	int min = 1;
	int max = 10000;
	Scanner scanner = new Scanner(System.in);
		
	while (true) {
		System.out.printf("Guess a number between " + min + " and " + max + ": ");
		int userGuess = scanner.nextInt();
		
		if (userGuess == randomNum) {
			System.out.println("WINNER!");break;
		} 
		
		else if (userGuess < randomNum) {
			System.out.println("HIGHER");
			min = userGuess + 1;
		} 
		
		else {
			System.out.println("LOWER");
			max = userGuess - 1;
		}
	}
	
	scanner.close();
	
	}
	
}