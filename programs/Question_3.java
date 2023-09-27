package programs;

import java.util.TreeMap;

public class Question_3 {

	 public static void main(String[] args) {
	        // Create a TreeMap to store employee IDs and names
	        TreeMap<Integer, String> employeeMap = new TreeMap<>();

	        // Add employee information to the TreeMap
	        employeeMap.put(101, "John Smith");
	        employeeMap.put(102, "Jane Doe");
	        employeeMap.put(103, "Robert Johnson");
	        employeeMap.put(104, "Emily Brown");
	        employeeMap.put(105, "Michael Wilson");

	        // Print employee names in alphabetical order
	        System.out.println("Employee names in alphabetical order:");

	        for (String name : employeeMap.values()) {
	            System.out.println(name);
	        }
	    }
	
}
