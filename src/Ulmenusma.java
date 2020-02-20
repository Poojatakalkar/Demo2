import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ulmenusma {
 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		WebElement user = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		user.click();

		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menu : all) {
			String item=menu.getText();
			System.err.println(item);
			a.moveToElement(menu).build().perform();
					
	    Thread.sleep(2000);
		List<WebElement> submenu = driver.findElements(By.xpath("//span[contains(.,'"+item+"')]/parent::li/descendant::ul[@class='taxonslist']/li"));

		for (WebElement subitem : submenu) {
			System.out.println(subitem.getText());

		}


	}
}
}