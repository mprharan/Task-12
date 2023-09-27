package programs;

import java.util.ArrayList;
import java.util.List;

public class Question_4 {

	public static void main(String[] args) {
        // Create a List of integers
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        // Convert the List to an array of integers
        Integer[] integerArray = integerList.toArray(new Integer[0]);

        // Print the elements of the array
        System.out.println("Array elements:");
        for (Integer num : integerArray) {
            System.out.println(num);
        }
    }
	
}
