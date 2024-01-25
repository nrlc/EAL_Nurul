package task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2B {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chy_h\\eclipse-workspace\\SeleniumTaskSolution\\webdriver\\chromedriver.exe");
		
		//Initialize ChromeDriver
				driver = new ChromeDriver();
				
				// Navigate to the Facebook website
				driver.get("https://www.facebook.com/");
				
				// Maximize the browser window
				driver.manage().window().maximize();
				
				// Pause execution for 2 seconds (in milliseconds)
				Thread.sleep(2000);
				//press back button
				driver.navigate().back();
				
				Thread.sleep(2000);
				//press forward button
				driver.navigate().forward();
				
				Thread.sleep(2000);
				//Verify the current url
				
				String Expected_URL = "https://www.facebook.com/";
				String Actual_URL = driver.getCurrentUrl();
				
				if(Expected_URL.equals(Actual_URL)) {
					System.out.println("Both url is same");
				}else {
					System.out.println("Expected URL is not matched with Actual URL");
				}
				
				Thread.sleep(2000);
				//Verify the Page Title(with if-else)
				
				String Expected_Title = "Facebook - log in or sign up";
				String Actual_Title = driver.getTitle();
				
				if(Expected_Title.equals(Actual_Title)) {
					System.out.println("Both Title is same");
				}else {
					System.out.println("Expected Title is not matched with Actual Title");
				}
				
				Thread.sleep(2000);
				//Click on "Create New Account" Field
				WebElement Create_Account = driver.findElement(By.linkText("Create new account"));
				Create_Account.click();
				
				//Fill Up All the Mandatory Fields (Firstname, Lastname etc) with any fake data
				Thread.sleep(10000);
				WebElement fn = driver.findElement(By.name("firstname"));
				fn.click();
				fn.sendKeys("Rayhan");
				
				Thread.sleep(2000);
				WebElement ln = driver.findElement(By.name("lastname"));
				ln.click();
				ln.sendKeys("Chowdhury");
				
				Thread.sleep(2000);
				WebElement email = driver.findElement(By.name("reg_email__"));
				email.click();
				email.sendKeys("rayhan@gmail.com");
				
				Thread.sleep(2000);
				WebElement confirm_email = driver.findElement(By.name("reg_email_confirmation__"));
				confirm_email.click();
				confirm_email.sendKeys("rayhan@gmail.com");
				
				Thread.sleep(2000);
				WebElement password = driver.findElement(By.name("reg_passwd__"));
				password.click();
				password.sendKeys("RC123456@");
				
				Thread.sleep(2000);
				//Select Month with Index
				WebElement all_Months = driver.findElement(By.name("birthday_month"));
				Select month = new Select(all_Months);
				month.selectByIndex(5);
				
				//Select Date of Birth with visible Text
				Thread.sleep(2000);
				WebElement all_days = driver.findElement(By.id("day"));
				Select day = new Select(all_days);
				day.selectByVisibleText("24");
				
				//Selectbirth year using value
				Thread.sleep(2000);
				WebElement all_years = driver.findElement(By.name("birthday_year"));
				Select year = new Select(all_years);
				year.selectByValue("1992");
				
				//Select female gender
				WebElement gender_female = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[1]"));
				gender_female.click();
				
				Thread.sleep(2000);
				WebElement signupbtn = driver.findElement(By.xpath("//button[text()='Sign Up' and @name='websubmit']"));
				signupbtn.click();
				
				//Press Back Button
				Thread.sleep(2000);
				driver.navigate().back();
				
				//Get Window Session ID
				String Window_SessionID = driver.getWindowHandle();
				System.out.println(Window_SessionID);
				
				Thread.sleep(2000);
				//Refresh the Page
				driver.navigate().refresh();
				
				Thread.sleep(2000);
				//Get page Title
				String page_title = driver.getTitle();
				System.out.println(page_title);
				
				Thread.sleep(2000);
				//Press Forward button
				driver.navigate().forward();
				
				Thread.sleep(2000);
				//close the browser
				driver.close();

	}

}
