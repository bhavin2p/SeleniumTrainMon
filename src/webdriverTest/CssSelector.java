package webdriverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class CssSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhpanchal\\Downloads\\browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));
		userName.sendKeys("Admin1234");
		
		WebElement password = driver.findElement(By.cssSelector("input[id*='Password']"));
		password.sendKeys("1234556");
		
		WebElement btn = driver.findElement(By.cssSelector("input.button[id='btnLogin']"));
		btn.click();
		
		

	}

}
