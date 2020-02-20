import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(10000);
		WebElement popup = driver.findElement(By.xpath("//input[@class='a-button-input']"));
		popup.click();

		
		WebElement user = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		user.click();

		WebElement tab = driver.findElement(By.xpath("//input[@value='Go']"));
		tab.sendKeys("shirt", Keys.ENTER);
		/*
		 * WebElement search =
		 * driver.findElement(By.xpath("//button[@id='search_button']"));
		 * search.click();
		 */
	}
}
