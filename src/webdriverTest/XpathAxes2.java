package webdriverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhpanchal\\Downloads\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.lambdatest.com/register/");
		driver.manage().window().maximize();
		//phone field
		//input[@id='userpassword']//following::input[@id='phone']
		driver.findElement(By.xpath("//input[@id='userpassword']//following::input[@id='phone']")).sendKeys("1234556");
		
		//preceding 
		driver.findElement(By.xpath("//input[@id='userpassword']//preceding::input[@id='email']")).sendKeys("test@gmail.com");
		
		
		
		

	}

}
