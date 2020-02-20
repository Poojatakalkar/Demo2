import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("p@gmail.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement next = driver.findElement(By.id("identifierNext"));
		next.click();
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("12345678");
		WebElement submit = driver.findElement(By.id("passwordNext"));
		submit.click();

	}
}
