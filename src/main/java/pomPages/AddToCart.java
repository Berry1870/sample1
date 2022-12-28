package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	//declaration
	@FindBy(id="add")
	private WebElement addbtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addToCart;
	
	//initialization
	AddToCart(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getAddbtn() {//getter method is used as we are performing double click
		return addbtn;
	}
	public void addToCartbtn() {
		addToCart.click();
	}
	
}
