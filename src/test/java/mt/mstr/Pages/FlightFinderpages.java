package mt.mstr.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mt.mstr.Utility.ClosedBrowser;
import mt.mstr.Utility.LaunchApp;
import mt.mstr.config.Config;

public class FlightFinderpages

{
	
	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_flightfinder.gif']")
	WebElement objflightfinder;
	
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	WebElement objSignOFF;

	public void loadFlightFinderpage()
	{
		PageFactory.initElements(Config.driver	, this);
	}
	
	public void verifyFlightFinder()
	{
		
		boolean flag=objflightfinder.isDisplayed();
		if(flag==true)
		{
			System.out.println("FlightFinder page is display");
		}
	}
	public void clickonSignOFF()
	{
		
		objSignOFF.click();
		
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
		
		
		FlightFinderpages ff=new FlightFinderpages();
		
		ff.loadFlightFinderpage();
		ff.verifyFlightFinder();
		ff.clickonSignOFF();
		
		
		ClosedBrowser cb=new ClosedBrowser();
		
		cb.closeBrowser();
		
		
		
		
	}
	
	
	
	
	
}
