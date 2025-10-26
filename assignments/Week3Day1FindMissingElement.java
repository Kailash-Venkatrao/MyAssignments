package week3.day1.assignments;

import java.util.Arrays;

public class Week3Day1FindMissingElement {

	public static void main(String[] args) {
		
		int elements[] =  {1,4,3,2,8,6,7};
		
		Arrays.sort(elements);
		//1 2 3 4 6 7 8
		
		for (int i = 0; i <= elements.length; i++) {
			if(elements[i+1]!=elements[i]+1)
				//1=1 2=2 3=3 4=4 
			{
				System.out.println("The missing element is: "+(elements[i]+1));
				break;
			}
		}

	}

}
