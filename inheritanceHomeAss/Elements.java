package inheritanceHomeAss;

public class Elements extends Button{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elements e=new Elements();
		
		TextField tf=new TextField();//object of the text field class
		
		CheckBoxButton cb = new CheckBoxButton();//object of the check box class
		
		RadioButton rb = new RadioButton();// object of the radio button class
		
		e.click(); //method of the super class WebElement
		
		tf.setText("This is the methd of TextField");
		
		e.submit();//method of the sub class button
		
		System.out.println(tf.getText());
		
		cb.clickCheckButton();
		
		rb.selectRadioButton();

	}

}
