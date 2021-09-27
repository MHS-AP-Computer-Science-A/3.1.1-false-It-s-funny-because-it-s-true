import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Complete the code as described by the comments below

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// 1. Sugar
		System.out.println("Enter the sugar you have consumed");
		int sugar = input.nextInt();

		// Replace 'true' below with the appropriate Boolean expression
		// 36 grams is the recommended upper limit so the output should
		// be true if the user has eaten less than 36g and false otherwise

		boolean canEatMoreSugar = true; 
		System.out.println("You can eat more sugar: " + canEatMoreSugar);

		// 2. Triple Double
		// In basketball, a triple double is when you end a game with statistics in
		// three different categories that are at least 10.
		// For example, you get a triple double if you have scored 10 points, got 10
		// rebounds, and had 10 assists in a game.

		// Ask for the three stats
		System.out.println("How many points did you score?");
		int points = input.nextInt();
		System.out.println("How many rebounds did you get?");
		int rebounds = input.nextInt();
		System.out.println("How many assists did you have?");
		int assists = input.nextInt();

		// Create three boolean variables that
		// check if the stats are 10 or more

		// Print out the value of each boolean
		// variable. Be sure to label them!

		// Create and print a boolean variable that determines if the
		// player got a triple double

		// 3. Amusement Park
		System.out.println("Enter your age: ");
		int age = input.nextInt();

		System.out.println("Enter your height in inches: ");
		int height = input.nextInt();

		// To ride you must be 12+ and have a height of 48+
		// Replace 'true' below with the appropriate expressions
		boolean oldEnough = true;
		boolean tallEnough = true;

		// Convert this boolean expression into its De Morgan equivalent
		boolean cannotRide = !(oldEnough && tallEnough);

		System.out.println("You cannot ride: " + cannotRide);

		// 4. Swimming
		System.out.println("Can you swim? Enter true or false.");
		boolean canSwim = input.nextBoolean();

		System.out.println("Do you have a life jacket? Enter true or false.");
		boolean hasLifeJacket = input.nextBoolean();

		// Convert this boolean expression into its De Morgan equivalent
		boolean cannotSwim = !canSwim && !hasLifeJacket;

		System.out.println("You cannot swim: " + cannotSwim);

	}

}
