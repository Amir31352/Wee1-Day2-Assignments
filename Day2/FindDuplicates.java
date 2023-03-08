package week1.Day2;

import java.util.Arrays;
import java.util.Iterator;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] nums= {2,5,7,7,5,9,2,3};
		
	Arrays.sort(nums);
			
 for (int i = 0; i < nums.length; i++) {
	 
	 if(nums[i]==nums[i+1])  //2==2 2==3 3==5 5==5
		 System.out.println(nums[i]);
	
}
			
	}
	
	
}
	
	
	


