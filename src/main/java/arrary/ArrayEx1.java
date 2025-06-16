package arrary;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		/*
		 * Initializing array 'a' using array literal syntax
		 * It holds 10 integers from 1 to 0
		 */
		int[] a = {1,2,3,4,5,6,7,8,9,0};
		
		/*
		 * Initializing array 'b' using 'new' keyword with array elements
		 * This array contains 5 predefined numbers
		 */
		int[] b = new int[]{5,5,68,99,66};

		/*
		 * Traditional for loop to print each element in array 'a'
		 * 'i' is used as the index to access each value
		 */
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " is the value at index " + i);
		}

		/*
		 * Enhanced for loop (for-each) to print elements in array 'b'
		 * Each value is temporarily stored in 'c' during each iteration
		 */
		for (int c : b) {
			System.out.println(c + " is a value in array b");
		}
	}
}