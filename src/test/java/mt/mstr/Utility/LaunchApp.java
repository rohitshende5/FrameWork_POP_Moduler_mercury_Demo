package mt.mstr.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import mt.mstr.config.Config;

public class LaunchApp {

	public void openBrowser(String browser)
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM_TESTING\\chromedriver.exe");
		
		Config.driver=new ChromeDriver();
		
	}
	
	public void enterApplicationURL(String url)
	{
		
		Config.driver.get(url);
	}
	
	public void maximizeBrowser()
	{
		
		Config.driver.manage().window().maximize();
	}
	
	public void loadtillloginpageloaded(int timeoutsecond)
	{
		Config.driver.manage().timeouts().pageLoadTimeout(timeoutsecond, TimeUnit.SECONDS);
		
			
		
	}
	
	public static void main(String args[])
	{
		
		LaunchApp la=new LaunchApp();
		
		la.openBrowser("chrome");
		la.enterApplicationURL("http://newtours.demoaut.com/mercurywelcome.php");
		la.maximizeBrowser();
		la.loadtillloginpageloaded(15);
		
	}
	
	
	
}
