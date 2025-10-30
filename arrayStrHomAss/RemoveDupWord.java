package arrayStrHomAss;

import java.util.Arrays;

public class RemoveDupWord {

	public static void main(String[] args) {
		
	String text = "We learn Java basics as part of java sessions in java week1";
	
	String newStr="";
	
	boolean dup;
	
    String[] strArr=text.split(" ");
   
    newStr="";
    
    for(int i=0;i<strArr.length;i++)
    {
    	dup=false;
    	for(int j=0;j<i;j++)
    	{
    	if((strArr[i].equalsIgnoreCase(strArr[j])))
    	{
    		dup=true;
    		break;
    	}
    	}
    
    if(!dup)
    {
    	newStr+=strArr[i]+" ";
    }
    }
    
    System.out.println("New String::: "+newStr);
    
  }
    
}
	


