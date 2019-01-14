package com.java.ds.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayList1 {
	
	public static void main(String[] args) {
		String first = "paul";
		StringBuilder last = new StringBuilder("cao");
		last.append(" cao");
		System.out.println(last);
		
	}
	public static void main1(String[] args) {
		
		int arr[] = {1,2,3};
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.set(0, 5);
		myList.add(0, 9);
		
		//for(;;);
		
		System.out.println("Original List :"+myList);
		
		/* Adding elements to the list */
		for(int i=0; i<10; i++)
		{
			myList.add(new Random().nextInt(50));
		}
		System.out.println("Filled List :"+myList);
		
		/* ArrayList access 1 */
		for(int i=0; i<myList.size(); i++)
		{
			System.out.println("Read element :"+myList.get(i));
		}
		
		/* ArrayList access 2 */
		for(Integer i:myList)
		{
			System.out.println("Read New Element :"+i);
		}
		
	}

}
