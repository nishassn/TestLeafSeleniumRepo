package week1.day2;

import java.util.Iterator;

public class FindFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fib_no = new int[8];
		fib_no[0]=0;
		fib_no[1]=1;
		
		
		for(int i =2;i<8;i++)
		{
		fib_no[i]=fib_no[i-1]+fib_no[i-2];
	    }
		
		for(int i=0;i<8;i++)
		{
			System.out.println(fib_no[i]);
		}
		

	}

}
