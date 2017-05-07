package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.HomePage;

public class SignIn {

	public static WebDriver driver;
	
	public static void SignIn()throws Exception{
		
		HomePage HomePage=PageFactory.initElements(driver, HomePage.class);

		HomePage.link_SignIn.click();
		
		HomePage.txtBox_email.sendKeys("tarun.a.sahu@capgemini.com");
		
		HomePage.txtBox_password.sendKeys("justatest");
		
		HomePage.btn_submit.click();
		
	}
	
	
public static void SignOut()throws Exception{
		
		HomePage HomePage=PageFactory.initElements(driver, HomePage.class);

		HomePage.link_UserProfile.click();
		
		HomePage.link_logOut.click();
		
	}
}
