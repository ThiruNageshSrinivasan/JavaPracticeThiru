package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListInterviewEx {

    public static void main(String[] args) {
        // Original list
        String fruits[] = {"O", "B", "M", "M", "O", "O"};

        // List to store non-"O" values
        ArrayList<String> nonzerolist = new ArrayList<String>();
        // List to store "O" values
        ArrayList<String> zerolist = new ArrayList<String>();

        // Loop through each item in fruits
        for (String value : fruits) {
            if (value.equalsIgnoreCase("O")) {
                zerolist.add("O");        // Put all "O" values here
            } else {
                nonzerolist.add(value);  // Put "B", "M", etc. here (FIXED)
            }
        }

        // Combine both lists: non-"O" first, then "O"
        nonzerolist.addAll(zerolist);

        // Final result
        System.out.println(nonzerolist);  // Expected: [B, M, M, O, O, O]
        
        //orginal array
        System.out.println("the orginal array is"+Arrays.toString(fruits));
    }
}

