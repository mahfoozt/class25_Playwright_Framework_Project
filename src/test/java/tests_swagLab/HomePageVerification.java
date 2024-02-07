package tests_swagLab;

import base.Base;

public class HomePageVerification extends Base {

	public static void main(String[] args) throws InterruptedException {
		
				startUp();
				//go to URL
				navigate("https://www.saucedemo.com/");
				//get title page
				System.out.println( page.title() );
				//verify title page
				assertion("//div[text()='Swag Labs']","Swag Labs");
				Thread.sleep(1000);
				p("Home Page Verification Done");
				Close_All();
			}

	

}
