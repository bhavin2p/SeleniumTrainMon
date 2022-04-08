package webdriverTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		
		//webdriver.gecko.driver
		//webdriver.ie.driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhpanchal\\Downloads\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement userName =  driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement btn = driver.findElement(By.className("button"));
		//btn.click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link : links) {
			System.out.println("Link text is = " +link.getText());
		}
		
		//WebElement forgetPwdLink = driver.findElement(By.linkText("Forgot your password?"));
		
		WebElement forgetPwdLink = driver.findElement(By.partialLinkText("your password?"));
		forgetPwdLink.click();
		//driver.quit();
		

	}

}
