package programs;

import java.util.ArrayList;

public class Question_2 {

	public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> stringList = new ArrayList<>();

        // Add some elements to the ArrayList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Print the ArrayList before removing elements
        System.out.println("ArrayList before removing elements: " + stringList);

        // Remove all elements from the ArrayList
        stringList.clear();

        // Print the ArrayList after removing elements
        System.out.println("ArrayList after removing elements: " + stringList);
    }
	
}
