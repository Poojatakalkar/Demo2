import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipcartclick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement close=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		close.click();
		Thread.sleep(2000);
		List<WebElement> ele=driver.findElements(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		for(WebElement menu:ele)
		{
			String item=menu.getText();
			System.err.println(item);
			a.moveToElement(menu).build().perform();
			
			Thread.sleep(2000);
			WebElement fan=driver.findElement(By.xpath("//a[@title='Fans']"));
			fan.click();
			WebElement sel=driver.findElement(By.xpath("//div[@class='_1rcHFq']"));
			sel.click();
			WebElement buy=driver.findElement(By.xpath("//span[@class='_279WdV']"));
			a.doubleClick(buy).perform();
			
			
			
		}
		
		
		
		
	}
}
