package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import pageObjects.HomePage;

public class LoginSteps {
	
	public static WebDriver driver;

@Given("^User is on Home Page$")
public void user_is_on_Home_Page() throws Throwable {
	
	driver.get("https://www.udemy.com");	
}

@When("^User Navigate to LogIn PopUP$")
public void user_Navigate_to_LogIn_PopUP() throws Throwable {
	HomePage HomePage=PageFactory.initElements(driver, HomePage.class);

	HomePage.link_SignIn.click();
	
	HomePage.btn_submit.click();    

}

@When("^User enters UserName and Password$")
public void user_enters_UserName_and_Password() throws Throwable {
    HomePage.txtBox_email.sendKeys("tarun.a.sahu@capgemini.com");
	
	HomePage.txtBox_password.sendKeys("justatest");    
}

@Then("^User Login Successfully$")
public void user_Login_Successfully() throws Throwable {

	HomePage.link_UserProfile.click();
	
}

@When("^User LogOut from the Application$")
public void user_LogOut_from_the_Application() throws Throwable {
	HomePage.link_logOut.click();    
	
}

@Then("^Message displayed LogOut Successfully$")
public void message_displayed_LogOut_Successfully() throws Throwable {
	HomePage.link_SignIn.click();
}



}
