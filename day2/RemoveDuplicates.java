package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
		String text = "We learn java basics as part of java sessions in java week1";
		String[] splitArray = text.split(" ");
		List<String> l = Arrays.asList(splitArray);
		System.out.println(l);
	    Set<String> set = new LinkedHashSet<String>(l);
	    System.out.println(set);
		
	}
	}
