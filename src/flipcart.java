import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipcart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement el=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		el.click();
		
		List<WebElement> ele=driver.findElements(By.xpath("//ul[@class='_114Zhd']/li"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		for(WebElement menu:ele)
		{
			String item=menu.getText();
			System.err.println(item);
			a.moveToElement(menu).build().perform();
			
			Thread.sleep(2000);
			List<WebElement> element=driver.findElements(By.xpath("//span[contains(.,'"+item+"')]/parent::li/descendant::ul[@class='QPOmNK']"));
			for(WebElement submenu:element)
			{
				System.out.println(submenu.getText());
			}
			
			
		}
		
		
	}
}
