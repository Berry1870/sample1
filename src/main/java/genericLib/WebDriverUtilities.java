package genericLib;

import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities 
{
	//ALL OF THE FOLLWOING METHODS ARE NON-STATIC PARAMETERIZED METHODS

		//generic method for handling drop-down 
		public void dropdown(WebElement ele, String text) 
		{
			Select s = new Select(ele);
			s.selectByVisibleText(text);
		}
	
		//generic method to perform mouseHover action
		public void mouseHover(WebElement ele,WebDriver driver) 
		{
			Actions a = new Actions(driver);
			a.moveToElement(ele).perform();	
		}
		//generic method to perform double click
		public void doubleClick(WebElement ele,WebDriver driver) 
		{
			Actions a = new Actions(driver);
			a.doubleClick().perform();
		}
	
		//generic method to handle drag and drop
		public void dragAndDrop(WebDriver driver, WebElement src, WebElement dest) 
		{
			Actions a = new Actions(driver);
			a.dragAndDrop(src, dest);
		}
	
		//generic method to handle alert popup
		public void alertPopup(WebDriver driver) 
		{
			driver.switchTo().alert().accept();//and we use driver.switchTo().alert().accept();->to cancel/dismiss
		}
	
		//generic method for switching back to previous frame
		public void switchBackFrame(WebDriver driver)
		{
			driver.switchTo().defaultContent();
		}
		
		//generic method to handle scroll bar
		public void scrollBar(WebDriver driver, int x, int y) 
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;//here JavascriptExecutor is a type-cast operator
			js.executeScript ("window.scrollBy("+x+","+y+")");
		}
		
		//generic method to switch tabs
		public void switchTabs(WebDriver driver) 
		{
			Set <String>child =driver.getWindowHandles();
			
			for(String b: child) 
			{
				driver.switchTo().window(b);
			}
		}
	
}
