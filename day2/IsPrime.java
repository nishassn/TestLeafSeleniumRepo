package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=19,count=0;
		for(int i=2;i<n-1;i++) {
			if(n%i == 0)
			{
				count=1;
			}
			
		}
		if (count==1)
		{
			System.out.println("The given number "+n+" is not prime");
		}
		else
		{
		
			System.out.println("The given number "+n+" is prime");

	}

}}
