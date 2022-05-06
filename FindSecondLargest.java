package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class FindSecondLargest {

	public static void main(String[] args) {
		
		List<Integer> List= new ArrayList<Integer>();
		
		List.addAll(Arrays.asList(3,2,11,4,6,7));
		
		int size = List.size();
		
		System.out.println("Arraylist size is " +size);
		

		Collections.sort(List);
		
		System.out.println("Soreted of the array List are " +List);
		
		Collections.reverse(List);
		
		System.out.println("Reverse of the array List are  " +List);
		
		
		System.out.println("The Second largest arrays are :  " + List.get(1));
		
		
		
		
		

	}

}
