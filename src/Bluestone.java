import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
				driver.get("https://www.bluestone.com/");
				Thread.sleep(10000); 
				  
			  WebElement main_menu = driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li[6]/a[@title='Jewellery']"));
			  WebElement sub_menu = driver.findElement(By.xpath("//a[contains(.,'All Jewellery ')]/parent::li/descendant::span[@data-p='mens-jewellery-kadas,m']"));
			  
			  Actions builder = new Actions(driver);
			  builder.moveToElement(main_menu).build().perform();
			  
			  sub_menu.click();
			  

/*		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		Actions a = new Actions(driver);
		
		
		for (WebElement menu : all) {
			String item=menu.getText();
			System.out.println(item);
			a.moveToElement(menu).build().perform();
			
			Thread.sleep(2000);
			List<WebElement> subitem = driver.findElements(By.xpath("//a[contains(.,'"+item+"')]/parent::li/descendant::ul[@class='odd-even-bg']/li"));
			
			for (WebElement sub : subitem) {
				System.out.println(sub.getText());
				a.moveToElement(sub).build().perform();
		*/	
		
		
			}
	}