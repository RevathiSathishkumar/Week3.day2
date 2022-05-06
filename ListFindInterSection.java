package week3.day2;

import java.util.List;
import java.util.Arrays;

public class ListFindInterSection {

	public static void main(String[] args) {
		
		//List <Integer> List1 =new ArrayList<Integer>();
		//List <Integer> List2 =new ArrayList<Integer>();
		
		List<Integer> aslist = Arrays.asList(3,2,11,4,6,7);
		
		List<Integer> aslist1 = Arrays.asList(1,2,8,4,9,7);
		
		for(int i=0;i<aslist.size();i++)
		{
			for(int j=0;j<aslist1.size();j++)
			{
				if(aslist.get(i)==aslist1.get(j))
					
				{
					System.out.println("The intersection of two arrays are   "  + aslist.get(i));
				}
			}
		}
	}

}
