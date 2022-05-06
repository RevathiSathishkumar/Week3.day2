package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {
	
	public static void main(String[] args) {
		
		List<Integer> List=new ArrayList<Integer>();
		
		List.addAll(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		
		Collections.sort(List);
		
		System.out.println("The sorted list of arrays are :  "+List);
		
		int size = List.size();
		
		System.out.println("The size of the arrays is :  "+size);
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<size;i++)
		{
			if (set.contains(List.get(i))) {

				
				System.out.println("The Duplicated Numbers are " + List.get(i));
			}


			else {
				set.add(List.get(i));
			}
	    
		}

		
	}

}
