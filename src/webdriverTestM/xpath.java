package webdriverTestM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhpanchal\\Downloads\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.manage().window().maximize();
		
		WebElement absoluteXpathUserName = driver.findElement(By.xpath("html/body/div/div/div[3]/div[2]/div[2]/form/div[2]/input"));
		absoluteXpathUserName.sendKeys("Monali");
		
		WebElement relativeXpathPassword = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		relativeXpathPassword.sendKeys("Monali123");
		
		//dyamic webelement handle using customize xpath
		//starts-with
		//syntax --> //tagName[starts-with(@id,'value')]
		//text syntax --> //tagName[starts-with(text(),'text')] --> //a[starts-with(text(),'Forgot')]
		//contains = [text(),'value']
		
		
		//syntax for text() ==>
		//tagName[text()='textValue'] <-syntax
		//a[text()='OrangeHRM, Inc'] 
		
		//AND = //input[@name='txtUsername' and @id='txtUsername']
		//xpath axes == 
		
	}

}
