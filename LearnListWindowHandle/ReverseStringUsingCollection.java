package LearnListWindowHandle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringUsingCollection {

	public static void main(String[] args) {
		String[] str=  {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> companyNameList=new ArrayList<String>();
		
		//add the strings to the list
		
		for(String companyName:str)
		{
			companyNameList.add(companyName);
			
		}
		System.out.println("Company Names before sorting:: " +companyNameList);

		//sort the list in ascending order
		Collections.sort(companyNameList);
		
		for(int i=companyNameList.size()-1;i>=0;i--)
		{
			System.out.print(companyNameList.get(i));
			if(i>0)
			{
				System.out.print(","+" ");
			}
		}
	}
    
}
