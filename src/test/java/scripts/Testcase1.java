package scripts;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.SkillaryLogin;
import pomPages.SkillraryDemoLogin;

public class Testcase1 extends StepGroup// all properties of StepGroup call inherited to Testcase1
{
	@Test
	public void tc1() 
	{
	// SkillaryLogin class imported from pomPages package
		SkillaryLogin sl = new SkillaryLogin(driver);// object creation
		sl.gearsButton();	//method called using reference variable
		sl.demoSkillaryApp(); 	//method called using reference variable
	
	//SkillraryDemoLogin class imported from pomPages package
		SkillraryDemoLogin sdl = new SkillraryDemoLogin(driver);// object creation
		driverutilities.switchTabs(driver);
		driverutilities.mouseHover(driver,sdl.getCourseTab());
	
	
	
	
	}

}
