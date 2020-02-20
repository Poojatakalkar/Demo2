import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class urbanladder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		WebElement connect = driver.findElement(By.xpath("//a[@class='google-auth']"));
		connect.click();
		Thread.sleep(10000);
		WebElement email = driver.findElement(By.xpath("//input[@id='identifierId']"));
		email.sendKeys("p@gmail.com");
		WebElement next = driver.findElement(By.xpath("//div[@id='identifierNext']"));
		next.click();
		WebElement pwd = driver.findElement(By.xpath("//input[@id='Passwd']"));
		pwd.sendKeys("12345678");
		WebElement sign = driver.findElement(By.xpath("//input[@id='signIn']"));
		sign.click();
		
	}
}