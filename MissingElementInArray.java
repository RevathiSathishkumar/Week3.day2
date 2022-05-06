package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {
	
	public static void main(String[] args) {
		
		List <Integer> List = new ArrayList<Integer>();
		
		List.addAll(Arrays.asList(1,2,3,4,7,6,8));
		
		Collections.sort(List);
		
		System.out.println("Soreted of the array List are " +List);
		
        int size = List.size();
		
		System.out.println("Arraylist size is " +size);
		
		int a= List.get(0);
		int b=List.get(size-1);
		
		for (int i=a+1;i<b;i++)
		{
			if(!List.contains(i))
			{
				System.out.println("The missing element is :  "+ i);
			}
		
	}

}
	
}
