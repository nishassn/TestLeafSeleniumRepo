package arrayStrHomAss;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		
		 // Declaration of arrays
		 
		 int a[]={3,2,11,4,6,7};
		 int b[]={1,2,8,4,9,7};
		 int i=0,j=0;
		 
		 Arrays.sort(a);
		 Arrays.sort(b);
		 
		 //a[]=2,3,4,6,7,11 and 1,2,4,7,8,9
		 
		 //Iterate through the loop
		 
		 
		while(i<a.length && j<b.length)
		{
			
			if(a[i]==b[j])
			{
				System.out.println(a[i]);
				i++;
				j++;
				
			}
			else if(a[i]<b[j])
			{
				i++; 
				
			}
			else
			{
				j++;
			}
		}

	}
	

}
