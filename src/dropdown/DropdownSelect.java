package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSelect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/select-menu");
		
		/*WebElement dropdown = driver.findElement(By.xpath("//select[@id='cars']"));
		
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("Saab");
		sel.selectByIndex(0);
		sel.selectByValue("opel");
		sel.selectByVisibleText("Audi");
		Thread.sleep(5000);
		
		sel.deselectAll();
		*/
		
		WebElement htmlElement = driver.findElement(By.xpath("//div[@class=' css-1hwfws3']/div[contains(text(),'option')]"));
		htmlElement.click();
		
		//driver.findElement(By.id("react-select-2-option-1-0")).click();
		
		

	}

}
