package collectionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//https://www.programiz.com/java-programming/examples/remove-duplicate-elements-from-arraylist
		
		
		ArrayList<Integer>number= new ArrayList<>(Arrays.asList(1,2,3,1,4,5,3,7));
		
		// convert the arraylist into a set
		
		Set<Integer>set = new LinkedHashSet<>();
		
		set.addAll(number);
		
		number.clear();
		
		number.addAll(set);
		
		System.out.println(number);
		
	
	
		
		
		

	}

}
