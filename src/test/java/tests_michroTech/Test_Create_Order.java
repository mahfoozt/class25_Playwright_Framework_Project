package tests_michroTech;

import base.Base;

public class Test_Create_Order extends Base{
	//Create Order page
	public static void main(String[] args) throws InterruptedException {
		startUp();		
		navigate("https://it.microtechlimited.com");
		System.out.println( page.title() );
		//assertion("x path","value");
		Thread.sleep(2000);
		click("//a[@href='elogin.php']");

		fill("//input[@name='mailuid']", "testpilot@gmail.com");
		
		fill("//input[@name='pwd']","1234");
		
		click("//input[@name='login-submit']");
		
		//Product order 
		click("//a[text()='Product Order']");
		
		page.selectOption("//select[@name='prodId']",  "Camera");
		
		fill("//input[@name='ordDate']","11/21/2023");
		
		click("//button[@type='submit']");
		
		System.out.println("Order Done");
		
		/*
		 * public static void count_Table_Head(String xpath,String xpath2) {//need to ask
		int num=page.locator(xpath).locator(xpath2).count();
		 System.out.println("Table head is : "+num);
		 
		 count_Table_Head("//table","//tr[1]/th");
		 //click("//select[@name='example_length']");
		//we clicked in the menu bar
		click("#example_length > label > select");
		//before clicking we need to find the select the div- meaning the main area at the beginning of code
		arrowdown("div.dt-demo-selector__options");
		 
		 */
		

	}

}
