package webdriverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhpanchal\\Downloads\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin1234");
		
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("1234556");
		
		driver.findElement(By.cssSelector(".button")).click();
		
		
		

	}

}
