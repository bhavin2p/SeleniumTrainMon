package webdriverTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		//Chrome / Firefox / Opera / Internet Explorer / Edge / Safari
		//Firefox = System.setProperty("webdriver.gecko.driver", "C:\Users\bhpanchal\Downloads\browser\geckodriver.exe")

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhpanchal\\Downloads\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		
		List<WebElement> elementA = driver.findElements(By.tagName("a"));
		for(WebElement element : elementA) {
			String link = element.getText();
			System.out.println(link);
			if(link.equals("Forget your password?")) {
				element.click();
			}
			
		}
		
		
		//driver.findElement(By.partialLinkText("your password?")).click();
		//driver.findElement(By.linkText("Forgot your password?")).click();
		//driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		//driver.get("https://www.google.com/");
		
		//driver.quit();

		
	}

}
