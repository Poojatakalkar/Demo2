import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestonehw {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
				driver.get("https://www.bluestone.com/");
				Thread.sleep(10000); 
				  
			  WebElement main_menu = driver.findElement(By.xpath("//a[@title='Gold Mine 10+1 Monthly Plan']"));
			  main_menu.click();
			  WebElement amt = driver.findElement(By.xpath("//input[@id='amount']"));
			  amt.sendKeys("2000");
			  WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
			  email.sendKeys("p@gmail.com");
			  WebElement start = driver.findElement(By.xpath("//input[@id='gmsStart']"));
			  start.click();
			  System.out.println(driver.getTitle());
			}
	}