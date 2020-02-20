import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestonclick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		List<WebElement> ele=driver.findElements(By.xpath("//a[@title='Jewellery']"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		for(WebElement menu:ele)
		{
			String item=menu.getText();
			System.err.println(item);
			a.moveToElement(menu).build().perform();
			
			Thread.sleep(2000);
			WebElement kadas=driver.findElement(By.xpath("//a[@title='Kadas']"));
			kadas.click();
			WebElement sel=driver.findElement(By.xpath("//div[@class='pr-i lazy-bg']/descendant::span[@class='p-wrap']/a[@id='pid_8966']"));
			sel.click();
			WebElement buy=driver.findElement(By.xpath("//input[@id='buy-now']"));
			a.doubleClick(buy).perform();
			
			
			
		}
		
		
		
		
	}
}
