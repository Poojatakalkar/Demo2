import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BShw {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		WebElement ring=driver.findElement(By.xpath("//a[@title='Rings']"));
			
			ring.click();
			List<WebElement> count=driver.findElements(By.xpath("//div[@class='product-buttons']/a"));
			System.out.println(count.size());
		
			}	
		
	}
	

