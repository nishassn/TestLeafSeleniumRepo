package week1.day2;

import java.util.Iterator;

public class FindFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,n=8;
		int prev=0,next=1;
		System.out.println("The fibonacci Series of the number "+n+" :");
		System.out.println(prev+"\n"+next);
		for(int i =2;i<8;i++)
		{
		temp=prev+next;
		System.out.println(temp);
		prev=next;
		next=temp;
	    }
		
	
		}

}

