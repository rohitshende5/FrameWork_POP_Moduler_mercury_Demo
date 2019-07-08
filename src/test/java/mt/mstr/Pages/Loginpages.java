package mt.mstr.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mt.mstr.Utility.LaunchApp;
import mt.mstr.config.Config;

public class Loginpages
{
	//2nd create FindBy annotation with webElements Objusername
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objusername;
	
	
	//3rd create FindBy annotation with password objWebElements
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objpassword;
	
	//4th create FindBY annotation with login objWebelements
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement objlogin;
	
	
	
	
	//1st create loadloginpage
	public void Loadloginpage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	public void enterusername(String username)
	{
		objusername.sendKeys(username);
	}
	
	public void enterpassword(String password)
	{
		objpassword.sendKeys(password);
	}
	
	public void clickonLogin()
	{
		objlogin.click();
	}
	
	
	public static void main(String[] args) {
		
		
		

		LaunchApp la=new LaunchApp();
		
		la.openBrowser("chrome");
		la.enterApplicationURL("http://newtours.demoaut.com/mercurywelcome.php");
		la.maximizeBrowser();
		la.loadtillloginpageloaded(15);
		
		
		
		Loginpages lp=new Loginpages();
		
		lp.Loadloginpage();
		lp.enterusername("Suvidyap1");
		lp.enterpassword("P@ssword1");
		lp.clickonLogin();
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
