
import java.awt.event.KeyEvent;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class google1 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement user = driver.findElement(By.name("q"));
		user.sendKeys("Java");
		Thread.sleep(2000);
		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	    for (WebElement menu : all) {
			System.out.println(menu.getText());
			}
		all.get(3).click();
	}
}