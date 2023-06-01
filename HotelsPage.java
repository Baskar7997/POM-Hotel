package pageObjects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class HotelsPage {

	 @FindBy(xpath = "(//div[@class='w-full flex-grow p-3 flex flex-col items-start cursor-pointer'])[2]")
	 public static WebElement chooseHotel;
		
	
	
}
