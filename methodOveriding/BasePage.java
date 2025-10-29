package methodOveriding;

public class BasePage {

	//Create methods like findElement(), clickElement(), enterText() and performCommonTasks()
	
	public void findElement()
	{
		System.out.println("Base class method --->findElement");
	}
	public void clickElement()
	{
		System.out.println("Base class method --->clickElement");
	}
	public void enterText()
	{
		System.out.println("Base class method --->enterText");
	}
	public void performCommonTasks()
	{
		System.out.println("Base class method --->performCommonTasks");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
