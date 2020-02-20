import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo15 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipcart.com/");
		Thread.sleep(10000);
		WebElement close = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		close.click();
		WebElement tab = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		tab.sendKeys("shirt", Keys.ENTER);
		//WebElement login = driver.findElement(By.xpath("//a[@class='_3Ep39l']"));
		//login.click();
		List<WebElement> all = driver.findElements(By.xpath("//a[@class='_3Ep39l']"));
		Actions a = new Actions(driver);
		for (WebElement item : all) {
			System.out.println(item.getText());
			a.moveToElement(item).build().perform();

		}

		
		/*
		 * WebElement search =
		 * driver.findElement(By.xpath("//button[@id='search_button']"));
		 * search.click();
		 */
	}
}
