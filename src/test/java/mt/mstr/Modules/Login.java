package mt.mstr.Modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mt.mstr.Pages.FlightFinderpages;
import mt.mstr.Pages.Loginpages;
import mt.mstr.Utility.ClosedBrowser;

public class Login
{

	@Parameters({"usernm","passwd"})
	@Test
	public void executewithvalidds(String username, String password)
	{
		Loginpages lp=new Loginpages();
		
		lp.Loadloginpage();
		lp.enterusername(username);
		lp.enterpassword(password);
		lp.clickonLogin();
		
		

		FlightFinderpages ff=new FlightFinderpages();
		
		ff.loadFlightFinderpage();
		ff.verifyFlightFinder();
		ff.clickonSignOFF();
		
		
		ClosedBrowser cb=new ClosedBrowser();
		
		cb.closeBrowser();
		
		
	}
	
	
}
