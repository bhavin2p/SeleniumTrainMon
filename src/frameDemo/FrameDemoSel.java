package frameDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemoSel {
	
	public static void main(String[] args) {
		//WebDriverManager
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhpanchal\\Downloads\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		
		WebElement element1 = driver.findElement(By.tagName("h1"));
		System.out.println(element1.getText());
		
		driver.switchTo().defaultContent();
		/*
		driver.findElement(By.xpath("//span[contains(text(),'Nested Frames')]")).click();
		
		WebElement frameWeb = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frameWeb);
		String str =  driver.findElement(By.xpath("//body[contains(text(),'Parent fr')]")).getText();
		System.out.println(str);*/
		driver.quit();
		
		
		
	}
	

}
