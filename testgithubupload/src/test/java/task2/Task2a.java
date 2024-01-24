package task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Task2a {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chy_h\\git\\testgit\\testgithubupload\\webdriver\\chromedriver.exe");
	driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://www.amazon.com/");
	String expected_url= "https://www.amazon.com/";
	String Actual_url= driver.getCurrentUrl();
	if(expected_url.equals(Actual_url)) {
		System.out.println("Expected url is matched with Actual url");
	}else {
		System.out.println("Expected url is not matched with Actual url");
	}
	
	String current_title = "Amazon.com";
	String page_title = driver.getTitle();
	if(current_title.equals(page_title)) {
		System.out.println("Current title is matched with page title");
	}else {
		System.out.println("Current title is not matched with page title");
	}
	
	Thread.sleep(8000);
	WebElement AccountList = driver.findElement(By.className("nav-line-1-container"));
	Actions act = new Actions(driver);
	act.moveToElement(AccountList).build().perform();
	
	Thread.sleep(4000);
	WebElement music = driver.findElement(By.xpath("//*[text()='Music Library']"));
	act.moveToElement(music).click().build().perform();


	}

}
