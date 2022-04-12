package webdriverTestM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhpanchal\\Downloads\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().window().maximize();
		//ID locator
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Monali");
		Thread.sleep(5000);
		userName.clear();
		userName.sendKeys("Admin");
		//Name locator
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		//ClassName locator
		WebElement loginBtn = driver.findElement(By.className("button"));
		//loginBtn.click();
		//LinkText
		WebElement forgetPassword =  driver.findElement(By.linkText("Forgot your password?"));
		//forgetPassword.click();
		//Partial LinkText
		WebElement forgetPassword2 =  driver.findElement(By.partialLinkText("your password"));
		//forgetPassword2.click();
		
		//find the broken links available on amazon website
		//TagName
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links on page with a anchor tag = " +links.size());
		for(WebElement link : links) {
			//String text = link.getText();
			String hrefLink = link.getAttribute("href");
			System.out.println(hrefLink);
		}
		
		
		
	}
}
