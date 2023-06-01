package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancelPage {
    
	@FindBy(xpath = "//div[text()='Cancel the booking?']")
    public static WebElement cancel;	
	@FindBy(xpath = "//button[text()='Yes']")
	public static WebElement yes;
	
}
