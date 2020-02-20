import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class google2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement user = driver.findElement(By.name("q"));
		user.sendKeys("Java",Keys.ENTER);
		List<WebElement> ele=driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		//h3[@class="LC20lb DKV0Md"]
		for(WebElement menu:ele)
		{
			String item=menu.getText();
			System.err.println(item);
			
	}
		
		
	}
}
