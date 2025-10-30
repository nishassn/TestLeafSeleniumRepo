package arrayStrHomAss;

public class ReverseOddWord {

	public static void main(String[] args) {
		
	String test = "I am a software tester";
	
	String rev="",newStr= "";
    
	//using split fun and store it in a array
	
	String[] strArr=test.split(" ");
	
	for(int i=0;i<strArr.length;i++)
	{
		//check for the odd index
		if(i%2==1)
		{
			char[] ch=strArr[i].toCharArray();
			
			//reverse the word 
			for(int j=ch.length-1;j>=0;j--)
			{
			 rev=rev+ch[j];	
			}
			//append to the existing string
		newStr=newStr+rev+" ";	
		}
		else
		{
			newStr=newStr + strArr[i]+" ";	
		}
		
	
   }
	System.out.println(newStr);

	}

}
