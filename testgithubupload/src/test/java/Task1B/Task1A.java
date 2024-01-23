package Task1A;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Task1A {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chy_h\\OneDrive\\Desktop\\EALClassTutorial\\EALClassTask\\webdriver\\chromedriver.exe");
		
		//Initialize ChromeDriver
		driver = new ChromeDriver();
		
		// Navigate to the Amazon website
		driver.get("https://www.amazon.com/");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Pause execution for 6 seconds (in milliseconds)
		Thread.sleep(6000);
		
		// Call method to handle captcha
		entercapcha();
		
		// Locate and click on the "Best Sellers" link
		WebElement Best_Sellers= driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		Thread.sleep(8000);
		Best_Sellers.click();
		
		 // Get and print the current URL
		String current_url= driver.getCurrentUrl();
		System.out.println(current_url);
		
		// Pause execution for 10 seconds
		Thread.sleep(10000);
		
		// Locate and click on the "New Releases" link
		//WebElement New_Releases = driver.findElement(By.xpath("(//a[text()='New Releases'])[2]"));
		WebElement New_Releases = driver.findElement(By.linkText("New Releases"));
		New_Releases.click();
		
		// Get and print the page title
		String tile = driver.getTitle();
		System.out.println(tile);
		
		// Pause execution for 8 seconds
		Thread.sleep(8000);
		
		// Locate the search input, enter "Phones," and submit the search
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.click();
		search.sendKeys("Phones");
		
		// Pause execution for 8 seconds
		Thread.sleep(8000);
		WebElement search_button =  driver.findElement(By.id("nav-search-submit-button"));
		search_button.click();
		
		// Get and print the current search URL
		String search_url = driver.getCurrentUrl();
		System.out.println(search_url);
		
		// Navigate back to the previous page
		driver.navigate().back();
		
		// Pause execution for 8 seconds
		Thread.sleep(8000);
		WebElement all_item= driver.findElement(By.id("searchDropdownBox"));
		Select all = new Select(all_item);
		all.selectByIndex(1);
		
		Thread.sleep(4000);
		all.selectByIndex(0);
		
		Thread.sleep(4000);
		all.selectByValue("search-alias=amazon-pharmacy");
		
		driver.close();
	
	}
	public static void entercapcha()
	{
		By ele=By.xpath("//a[@id='nav-logo-sprites' or @id='nav-bb-logo']");
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMinutes(2));
		w.until(ExpectedConditions.visibilityOfElementLocated(ele));


}

}

