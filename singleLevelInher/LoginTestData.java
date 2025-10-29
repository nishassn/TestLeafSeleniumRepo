package singleLevelInher;

public class LoginTestData {
	//- enterUsername()
	// - enterPassword()
	
	void  enterUsername()
	{
		System.out.println("Sub class enterUserNAme Method");
	}
	
	void  enterPassword()
	{
		System.out.println("SUb class  emterPassword  Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instantiate the class
		LoginTestData ltd = new LoginTestData();
		
		TestData td=new TestData();
		
		ltd.enterUsername();
		ltd.enterPassword();
		
		td.enterCredentials();
		td.navigateToHomePage();

	}

}
