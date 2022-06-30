package day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]= {3,2,11,4,6,7};
  int b[]={1,2,8,4,9,7};
  
  
  //Create 2 list 
  ArrayList<Integer> list1 = new ArrayList<Integer>(a.length);
  ArrayList<Integer> list2 = new ArrayList<Integer>(b.length);
  ArrayList<Integer> list = new ArrayList<Integer>();
  
  for(int ele: a) {
	 list1.add(ele);
  }
  for(int ele: b) {
		 list2.add(ele);
	  }
  
  System.out.println(list1);
  System.out.println(list2);
for(int i=0;i<list1.size();i++) {
	for(int j=0;j<list2.size();j++) {
		if(list1.get(i)==list2.get(j)) {
			list.add(list1.get(i));
	}
	
	}
}
  System.out.println(list);


  
}
}
