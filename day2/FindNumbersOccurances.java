package day2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };

		Map<Integer, Integer> map = new TreeMap();
		for (int i = 0; i < arr.length; i++) {
			//Put a Condition to to check this key is already exist or not ?
		if(map.containsKey(arr[i])) {
			//If true then increase the value by 1
			map.put(arr[i], map.get(arr[i])+1);
		}
		else {
			//Set the default value 1
			map.put(arr[i], 1); 
		}
		
	}
		System.out.println(map);
}
}