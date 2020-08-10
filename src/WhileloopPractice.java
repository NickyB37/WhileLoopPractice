import java.util.Scanner;

public class WhileloopPractice {

	public static void main(String[] args) {
		/* Type your code here. */
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter a number:");

		int userInput = scnr.nextInt();

		System.out.println("Please enter a number:");
		int userInput2 = scnr.nextInt();

		if (userInput > userInput2) {
			System.out.println("Second integer can't be less than the first.");
		}
		
		while (true) {
			if (userInput <= userInput2) {
				System.out.print(userInput);
			}
				if (userInput <= userInput2) {
				userInput = userInput + 10;

			}

		}
		
	}

	}


