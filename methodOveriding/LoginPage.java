package methodOveriding;

public class LoginPage extends BasePage{
	
	//@override
	public void performCommonTasks()
	{
	 System.out.println("Perform Common Tasks from subclass LoginPage");	
	}
	
    public void callParentMethod()
    {
    	super.performCommonTasks();
    }
	

	public static void main(String[] args) {
		
	//SUb class object	
	 LoginPage lp=new LoginPage();
	 
	
	 //BasePage bp= new BasePage();
	 
	 lp.performCommonTasks(); //calls overridden fun
	 
	 lp.findElement(); //calls parent class method
	 
	 lp.clickElement();  //calls parent class method
	 
	 lp.enterText();  //calls parent class method

	 lp.callParentMethod(); //calls parent perform common method 
	}

}
