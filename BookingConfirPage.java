package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingConfirPage {
	
   @FindBy(xpath ="(//span[@class='rounded-xl flex justify-between items-center gap-4']/input)[1]")	
   public static WebElement firstName;
   @FindBy(xpath ="(//span[@class='rounded-xl flex justify-between items-center gap-4']/input)[2]")	
   public static WebElement lastName;
   @FindBy(xpath = "(//span[@class='rounded-xl flex justify-between items-center gap-4']/input)[3]")
   public static WebElement age;
   @FindBy(xpath = "//span[@class='rounded-xl flex justify-between items-center gap-4']/select")
   public static WebElement gender;
   @FindBy(xpath = "//span[@class='rounded-xl flex justify-between items-center gap-4']/select/option[2]")
   public static WebElement male;
   @FindBy(xpath ="(//div[@class='w-full  flex gap-4 p-0.5 rounded-xl  shrink justify-center items-center'])[1]/input")
   public static WebElement address;
   @FindBy(xpath ="//button[@class='w-full flex justify-between items-center bg-transparent']/input")
   public static WebElement country;
   @FindBy(xpath = "//span[text()='India']")
   public static WebElement india;
   @FindBy(xpath ="//input[@placeholder='Zipcode*']") 
   public static WebElement zipcpde;
   @FindBy(xpath ="(//div[@class='w-full  flex gap-4 p-0.5 rounded-xl  shrink justify-center items-center'])[2]/input")
   public static WebElement city;
   @FindBy(xpath ="//input[@placeholder='Email*']")
   public static WebElement email;
   @FindBy(xpath ="//input[@placeholder='Contact number']")
   public static WebElement phoneNo;
   
}
