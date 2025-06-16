package loops;

public class DoWhileEx {

	/*
	 * Program Title  : DoWhileEx.java
	 * Purpose        : Demonstrates the behavior of a 'do-while' loop in Java
	 * Real-life angle: Sends an encouraging message at least once,
	 *                  even if your final annual rating isn't available or true
	 */

	public static void main(String[] args) {
		
		/*
		 * Step 1: Declare and initialize a boolean variable 'finalannualrating'
		 * It represents whether a valid final rating has been received.
		 * Here, it's set to false to demonstrate that the loop still runs once.
		 */
		boolean finalannualrating = false;

		/*
		 * Step 2: Use a 'do-while' loop
		 * - The code inside the 'do' block runs at least once,
		 *   regardless of the condition in 'while'
		 * - Useful for scenarios where we want to execute something
		 *   before checking the condition (e.g., showing a message)
		 */
		do {
			System.out.println("dont consider your annual rating and  i gave you good rating so dont worry");
		}
		while (finalannualrating);

		/*
		 * Since finalannualrating is false, the loop runs only once.
		 * The encouraging message is printed no matter what!
		 */
	}
}