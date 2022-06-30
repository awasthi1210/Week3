package day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstMostDuplicate {

	public static void main(String[] args) {
		String str = "abbaba";
		char[] charArray = str.toCharArray();
// Create a map
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int maxValue = 1;
		char maxOccurance = 0;
		//loop for put the values in the map
		for (int i = 0; i < charArray.length; i++) {
             // Condition to verify the key is already exist in map or not
			if (map.containsKey(charArray[i])) {
				Integer curr_value = map.get(charArray[i]);
			 // if may contains the key already then increase the value by 1
				map.put(charArray[i], curr_value + 1);
				// put the condition if the value is greater than the max value that we declared ?
				if (map.get(charArray[i]) > maxValue) {
					//Swapping the values if condition is true
					maxOccurance = charArray[i];
					maxValue = map.get(charArray[i]);
				}
				
			} 
			else {
				//if map does not has the key already then put the value 1 by default
				map.put(charArray[i], 1);
			}

		}
		//Print the First max duplicate char and value  
		System.out.println(maxOccurance);
		System.out.println(maxValue);

	}

}