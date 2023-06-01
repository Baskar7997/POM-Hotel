package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage {
 
	
	@FindBy(xpath = "//input[@placeholder='Search for hotels']")
	public static WebElement searchHotels ;
	
		
	@FindBy(xpath = "//span[text()='LAX, Los Angeles - CA, United States']")
	public static WebElement selectHotels;
	 		
	
	
    public static WebElement calendar(ChromeDriver driver) throws InterruptedException {	 
	 WebElement next = driver.findElement(By.xpath("//div[@class='DayPickerNavigation_button DayPickerNavigation_button_1 DayPickerNavigation_button__default DayPickerNavigation_button__default_2 DayPickerNavigation_button__horizontal DayPickerNavigation_button__horizontal_3 DayPickerNavigation_button__horizontalDefault DayPickerNavigation_button__horizontalDefault_4 DayPickerNavigation_rightButton__horizontalDefault DayPickerNavigation_rightButton__horizontalDefault_5']"));
	
	 next.click();
		 Thread.sleep(800);
	 next.click();
		 Thread.sleep(800);
	 next.click();
		 Thread.sleep(800);
	 next.click();
	    return next;			 
    }
   
    public static WebElement inDate(ChromeDriver driver) throws InterruptedException {	
    	Actions action = new Actions(driver);
    	Thread.sleep(1000);
        WebElement start = driver.findElement(By.xpath("//table[@class='CalendarMonth_table CalendarMonth_table_1']/tbody/tr[2]/td[3]"));    	
        action.moveToElement(start).click().perform();
        return start;
    }
  
    public static WebElement outDate(ChromeDriver driver) throws InterruptedException {	
    	Actions action = new Actions(driver);
    	Thread.sleep(1000);
    	WebElement end = driver.findElement(By.xpath("//table[@class='CalendarMonth_table CalendarMonth_table_1']/tbody/tr[3]/td[4]"));
    	action.moveToElement(end).click().perform();
    	return end;
    }

	/*  public static WebElement room(ChromeDriver driver) { driver.findElement(By. xpath("//span[@class='w-full block text-sm text-left font-normal']")).click() ; 
	  driver.findElement(By.xpath("(//div[@class='nc-NcInputNumber flex items-center justify-between w-1/2'])[2]/button[2]")).click();
	  WebElement asfd = driver.findElement(By.xpath("//button[text()='Done']")); 
	  asfd.click(); 
	  return asfd ; 
	  }
	*/ 
    
    
    @FindBy(xpath ="//span[text()='Search for hotels']" )
	public static WebElement submit;
    	 

}


