import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo17 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://actitime.jmr.co.za/actitime/login.do");
		WebElement title = driver.findElement(By.xpath("//td[@class='loginlogo3']"));
		System.out.println(title.getText());
		WebElement username = driver.findElement(By.xpath("//tbody/tr[2]/td/input"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input"));
		password.sendKeys("manager");
		WebElement login = driver.findElement(By.xpath("//tbody/tr[4]/td[1]/table[1]/tbody/tr[6]/td/input"));
		login.click();

		 
		
	}
}