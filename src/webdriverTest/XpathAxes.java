package webdriverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhpanchal\\Downloads\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.xpath("html/body/div/div/div[3]/div[2]/div[2]/form/div[2]/input"));
		userName.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		password.sendKeys("admin123");
		//right click and copy xpath / Css selector
		//following-sibling = to find Monkey Luffy
		//table[@class='table']//following-sibling::tbody/tr[5]/td[1]
		//click on link View of Employee - Monkey
		//table[@class='table']//following::tbody/tr[5]/td[contains(text(),'Monkey')]//following::a[1]
		
		
		
		
	}

}
