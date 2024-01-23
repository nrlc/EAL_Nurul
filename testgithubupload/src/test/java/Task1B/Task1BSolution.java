package Task1B;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1BSolution {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chy_h\\Selenium_Tutorial\\Selenium_Task\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(10000);
		WebElement Create_Account = driver.findElement(By.linkText("Create new account"));
		Create_Account.click();
		
		Thread.sleep(10000);
		WebElement fn = driver.findElement(By.name("firstname"));
		fn.click();
		fn.sendKeys("Nurul");
		
		Thread.sleep(2000);
		WebElement ln = driver.findElement(By.name("lastname"));
		ln.click();
		ln.sendKeys("Chowdhury");
		
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.click();
		email.sendKeys("nrlhchow@gmail.com");
		
		Thread.sleep(2000);
		WebElement confirm_email = driver.findElement(By.name("reg_email_confirmation__"));
		confirm_email.click();
		confirm_email.sendKeys("nrlhchow@gmail.com");
		
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.click();
		password.sendKeys("SA123456@");
		
		Thread.sleep(2000);
		WebElement all_Months = driver.findElement(By.name("birthday_month"));
		Select month = new Select(all_Months);
		month.selectByIndex(5);
		
		Thread.sleep(2000);
		WebElement all_days = driver.findElement(By.id("day"));
		Select day = new Select(all_days);
		day.selectByVisibleText("24");
		
		Thread.sleep(2000);
		WebElement all_years = driver.findElement(By.name("birthday_year"));
		Select year = new Select(all_years);
		year.selectByValue("1992");

	}

}
