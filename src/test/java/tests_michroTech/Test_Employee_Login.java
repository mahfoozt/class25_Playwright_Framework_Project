package tests_michroTech;

import base.Base;

public class Test_Employee_Login extends Base{
	//Login as Employee 
	public static void main(String[] args) throws InterruptedException {
		startUp();
		//go to Micro tech home page
		navigate("https://it.microtechlimited.com");
		//print title	
		System.out.println( page.title() );
		Thread.sleep(2000);
		//click employee login
		click("//a[@href='elogin.php']");
		//enter user id
		fill("//input[@name='mailuid']", "testpilot@gmail.com");
		//enter password
		fill("//input[@name='pwd']","1234");
		//click login button
		click("//input[@name='login-submit']");
		//verification of employee login
		assertion("//h2[2]", "Welcome Test");
		String welcomeMessage = innerText("//h2[2]");	
		System.out.println(welcomeMessage);
		p("Employee Login Page Verification Done");
		assertion("//h2[1]", "Employee Id: 102");
		String employeeId = innerText("//h2[1]");
		System.out.println( employeeId );
		assertion("//h2[1]","Employee Id: 102");
		p("Employee Id Verification Done");
		
		//pageClose();
		//browserClose();
		//playwrightClose();
		Close_All();
		//pageClose();
		

	}

}
