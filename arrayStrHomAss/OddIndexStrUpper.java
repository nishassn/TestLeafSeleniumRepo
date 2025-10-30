package arrayStrHomAss;

public class OddIndexStrUpper {

	public static void main(String[] args) {
	
		String changedStr="",str="changeme";
		
		char ch;
		
		for(int i=0;i<str.length();i++)
			{
			 ch=str.charAt(i);
			if(i%2==1)
			{
				changedStr=changedStr+Character.toUpperCase(ch);
			}
			else
			{
				changedStr=changedStr+ch;
			}
			
		}
		
		System.out.println("The new String is "+changedStr);
		

	}

}
