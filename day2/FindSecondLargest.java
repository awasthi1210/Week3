package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
	     
		List<Integer> intList = new ArrayList<Integer>(data.length);
		for (int i : data)
		{
		    intList.add(i);
		    
		}
		Collections.sort(intList);
		
		System.out.println(intList.get(intList.size()-2));

	}}
