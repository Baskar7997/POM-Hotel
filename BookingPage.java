package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BookingPage {
	public static WebElement roomOptions(ChromeDriver driver) {
		 Set<String> windowHandles1 = driver.getWindowHandles();
	     List<String> book=new ArrayList<String>(windowHandles1);
		 driver.switchTo().window(book.get(1));
		return driver.findElement(By.xpath("//span[text()='Show More']"));
			}
	 @FindBy(xpath = "(//button[text()='Book'])[2]")
	public static WebElement selectRoom;
			
	@FindBy(xpath = "//button[text()='Proceed to Checkout']")
	public static WebElement checkOut; 
	    	
	
}
