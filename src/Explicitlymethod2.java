import java.awt.event.KeyEvent;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitlymethod2 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement user = driver.findElement(By.name("q"));
		user.sendKeys("Java",Keys.ENTER);
		Thread.sleep(2000);
		WebDriverWait ww=new WebDriverWait(driver, 10);
		//ww.until(ExpectedConditions.attributeContains(By.name("q"), "value", "java"));
	    ww.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='gb_4 gb_5 gb_ce gb_Wc']")));
	//	ww.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//a[@class='gb_4 gb_5 gb_ce gb_Wc']"),"Sign in"));
		System.out.println("search completed");
		
}
}