package mt.mstr.Modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mt.mstr.Utility.LaunchApp;

public class Launch
{

	@Parameters({"browser","url","timeoutsecond"})
	@Test
	public void executeLaunch(String browsernm, String urlnm, int timeoutseconds)
	{
		
		LaunchApp la=new LaunchApp();
		
		la.openBrowser(browsernm);
		la.enterApplicationURL(urlnm);
		la.maximizeBrowser();
		la.loadtillloginpageloaded(timeoutseconds);
		
		
	}
	
	
	
}
