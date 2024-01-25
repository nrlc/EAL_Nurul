package task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test1 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chy_h\\eclipse-workspace\\SeleniumTaskSolution\\webdriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	//Go to Amazon(https://www.amazon.com)
	driver.get("https://www.amazon.com/");
	
	//Verify the Current URL (with if-else)
	
	String Expected_URL = "https://www.amazon.com/";
	String Actual_URL = driver.getCurrentUrl();
	
	if(Expected_URL.equals(Actual_URL)) {
		System.out.println("Both url is same");
	}else {
		System.out.println("Expected URL is not matched with Actual URL");
	}
	
	//Verify the Page Title(with if-else)
	
	String Expected_Title = "Amazon.com";
	String Actual_Title = driver.getTitle();
	
	if(Expected_Title.equals(Actual_Title)) {
		System.out.println("Both Title is same");
	}else {
		System.out.println("Expected Title is not matched with Actual Title");
	}
	
	Thread.sleep(8000);
	//Hover Over on "Account&Lists" Click on "Music Library" By Storing Elements with XPath
	
	WebElement AccountList = driver.findElement(By.xpath("//*[text()='Account & Lists']"));
	Actions act = new Actions(driver);
	act.moveToElement(AccountList).build().perform();
	
	WebElement MusicLibrary = driver.findElement(By.xpath("//*[text() = 'Music Library']"));
	MusicLibrary.click();
	
	//Get current URL Verify them
	String expected_URL = "https://music.amazon.com/?ref=nav_youraccount_cldplyr";
	String actual_URL = driver.getCurrentUrl();
	if(expected_URL.equals(actual_URL)) {
		System.out.println("Expected URL: "+ expected_URL +" is same as " + "Current URL: " + actual_URL);
	}else {
		System.out.println("Expected URL is not matched with Actual URL");
	}
	//go back
	Thread.sleep(2000);
	driver.navigate().back();
	
	//Write "Phones" in the Search Fields
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("Phones");
	
	//Press  Search Button
	Thread.sleep(2000);
	WebElement search_button =  driver.findElement(By.id("nav-search-submit-button"));
	search_button.click();
	
	//Get Current URL
	String CurrentURL = driver.getCurrentUrl();
	System.out.println("Phones " +CurrentURL);
	
	//Press back button
	driver.navigate().back();
	
	//Select "All" Drop Down From Search Bar
	Thread.sleep(2000);
	WebElement all_item= driver.findElement(By.id("searchDropdownBox"));
	all_item.click();
	Select all = new Select(all_item);
	//Select "Amazon Devices" Select by index
	all.selectByIndex(3);
	
	//Again Click on "Selection Tab"
	Thread.sleep(2000);
	all_item.click();
	
	//Select "Amazon Fresh" (By Visible Text)
	all.selectByVisibleText("Amazon Fresh");
	
	//Again Click on "Selection Tab"
	Thread.sleep(2000);
	all_item.click();
	
	//Select "Appliances"(By Value)
	all.selectByValue("search-alias=appliances");
	}
}
