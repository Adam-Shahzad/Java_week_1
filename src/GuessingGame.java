import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {

	public static void main(String[] args) {

		System.out.println("Please enter an integer between 1 and 100: ");
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());

		int numbr = 50;
		int half = 50;

		System.out.println("My guess is: " + numbr);

		// System.out.println("Is your number higher or lower? (H/L)");

		// String HL = sc.nextLine();

		while (number != numbr) {
			System.out.println("Is your number higher or lower? (H/L)");
			String HL = sc.nextLine();

			half = half / 2;
			if (half < 1) {
				half = 1;
			}

			if (HL.equals("H") | HL.equals("h")) {
				numbr = (int) (numbr + half);
				System.out.println(numbr);
			} else if (HL.equals("L") | HL.equals("l")) {
				numbr = (int) (numbr - half);
				System.out.println(numbr);

			}

		}

		System.out.println("your number is: " + numbr + "!");
	}
}
