package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;


public class SetRemoveDuplicate {
	
	public static void main(String[] args) {
		
		
		String text = "We learn java basics as part of java sessions in java week1";	
		
		String text1="";
		
		String[] text2 = text.split("");
		
		System.out.println(text2);
		
		LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(text2)); 
		
		for(String eachword : set)
		{
			text1 =text1 + eachword +" " ;
		}
		
		System.out.println(text1);
	}

}
