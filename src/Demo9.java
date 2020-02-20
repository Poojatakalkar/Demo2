import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement user=driver.findElement(By.xpath("//input[@type='email']"));
		user.sendKeys("pooja");
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("pooja123");
		WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
		login.click();
		
		
	}
}
