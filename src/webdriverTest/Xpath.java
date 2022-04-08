package webdriverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		//webdriver.gecko.driver
		//webdriver.ie.driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhpanchal\\Downloads\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//absolute Xpath
		WebElement userName = driver.findElement(By.xpath("html/body/div/div/div[3]/div[2]/div[2]/form/div[2]/input"));
		userName.sendKeys("Admin");
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		password.sendKeys("admin123");
		
		//driver.quit();
		

	}

}
