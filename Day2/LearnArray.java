package week1.Day2;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//data type [] varialbe name ={Values}
		int[] scores = {90, 80, 40, 35};
		
		//to find the length of array
		int len =scores.length;
		
		System.out.println("the lenght of Array is  :" +len);

		
		//to retrive signle element
	  System.out.println(scores[3]);
	  
	  for (int i = 0; i < len; i++) {
		
		  System.out.println(scores[i]);
	}
	  
	}

}
