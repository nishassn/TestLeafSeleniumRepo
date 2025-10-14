package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1;
		boolean isPrime = true;
		if(n<=1)
		{
			System.out.println("The given number "+n+" is not prime");
			return;
		}

		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i == 0)
			{
				isPrime=false;
			}
			
		}
		if (isPrime)
				
		{
			System.out.println("The given number "+n+" is prime");
		}
		else
		{
		
			System.out.println("The given number "+n+" is not prime");

	}

}}
