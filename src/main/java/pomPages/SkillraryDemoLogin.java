package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLogin {
	//declaration
	@FindBy(id="course")
	private WebElement courseTab;
	
	@FindBy(xpath="//a[contains(text(),'Selenium Training')]")
	private WebElement seleniumTraining;
	
	//initialization
	public SkillraryDemoLogin(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	//create getter method for mouserhover action
	public WebElement getCourseTab() {
		return courseTab;
	}
	
	public void seleniumTrainingbtn() {
		seleniumTraining.click();
	}
	

}
