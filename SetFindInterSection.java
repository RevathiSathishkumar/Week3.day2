package week3.day2;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetFindInterSection {
	
	public static void main(String[] args) {
		
        Set<Integer> set = new HashSet<Integer>();   
		
		set.addAll(Arrays.asList(3,2,11,4,6,7));
		
	    Set<Integer> set1 = new HashSet<Integer>();
		 
		set1.addAll(Arrays.asList(1,2,8,4,9,7));
	   
		set.retainAll(set1);
		
		System.out.println("The find intersection of arrays are:  "+set );
		
	}

}
