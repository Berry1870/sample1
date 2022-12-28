package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryLogin {
	//declaration
	@FindBy (xpath="//a[text()=' GEARS ']")
	private WebElement gearsTab;
	
	@FindBy(xpath="(//a[contains(@class,'ignorelink')])[18]")
	private WebElement demoApp;
	
	//initialization
	public SkillaryLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
	//utilization
	//clicking action on gears button
	public void gearsButton() {
		gearsTab.click();
	}
	
	//clicking action on skillary demo app button
	public void demoSkillaryApp() {
		demoApp.click();
	}
/*
Note: as after clicking on skillary demo app button, it opens new tab so we have created new class
as we have written in rules (see Notes) ---->class-->SkillraryDemoLogin
 */
	
	

}
