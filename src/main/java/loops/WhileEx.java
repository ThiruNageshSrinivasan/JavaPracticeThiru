package loops;

public class WhileEx {

	/*
	 * Program Title : WhileEx.java
	 * Purpose      : Demonstrates the use of a 'while' loop in Java
	 * Real-life analogy : Continuously checking phone charging status until it reaches 100%
	 */

	public static void main(String[] args) {
		
		/*
		 * Step 1: Declare and initialize the variable 'currentphonecharge'
		 * This variable holds the current battery percentage, starting from 20%
		 */
		int currentphonecharge = 20;

		/*
		 * Step 2: 'while' loop starts here
		 * Condition: Keep looping as long as currentphonecharge is less than 100
		 * Loop behavior:
		 * - Display an alert message showing current charge
		 * - Increase the battery percentage by 20 on each iteration
		 */
		while (currentphonecharge < 100) {
			System.out.println("alert on charged addition 20 percent " + currentphonecharge + "%");
			currentphonecharge = currentphonecharge + 20; // incrementing charge
		}

		/*
		 * Step 3: When condition is no longer true (i.e., charge is 100 or more),
		 * the loop stops and this final message is displayed
		 */
		System.out.println("your mobile is charged 100%");
	}
}