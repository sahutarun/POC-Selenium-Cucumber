package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	public static WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		
	}
	
	 @FindBy(how=How.XPATH, using="//div[@class='dropdown dropdown--login']")
	   public static WebElement link_SignIn;
	 
	 @FindBy(how=How.ID, using="id_email")
	   public static WebElement txtBox_email;
	 
	 @FindBy(how=How.ID, using="id_password")
	   public static WebElement txtBox_password;
	 
	 @FindBy(how=How.ID, using=" submit-id-submit")
	   public static WebElement btn_submit;
	 
	 @FindBy(how=How.XPATH, using="//img[@class='dropdown__avatar']")
	   public static WebElement link_UserProfile;
	 
	 @FindBy(how=How.XPATH, using="	 .//*[@id='udemy']/div[2]/div[2]/div[4]/div[5]/div[2]/ul/li[13]/a/span")
	   public static WebElement link_logOut;
	 
	
	 
	

}

