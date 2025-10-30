package arrayStrHomAss;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		 
		int[] arr={1, 4,3,2,8, 6, 7};
		
		int missingNo;
		
		int xor1=0,xor2=0; // to perform the xor operation to cancel out the duplicates
		
		for(int num : arr)
		{
			xor1^=num; //store the arr values in xor1
		}
		for(int i=1;i<=arr.length+1;i++)
		{
			xor2^=i;  //add all the nos from 1 to n
		}
		
		 missingNo=xor1^xor2;
		 System.out.println("The missing No is "+missingNo);


	}

}
