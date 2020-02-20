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

public class Explicitlyactitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		password.sendKeys("manager");
		WebElement login = driver.findElement(By.xpath("//a[@id='loginButton']"));
		login.click();
		WebDriverWait ww = new WebDriverWait(driver, 10);
		
		ww.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='logout']")));
		

		System.out.println("search completed");

	}
}