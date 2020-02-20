import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookhw {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement first=driver.findElement(By.xpath("//input[@name='firstname']"));
		first.sendKeys("XYZ");
		WebElement last=driver.findElement(By.xpath("//input[@name='lastname']"));
		last.sendKeys("abc123");
		
		WebElement mobile=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobile.sendKeys("9865321245");
		WebElement pass=driver.findElement(By.xpath("//input[@data-type='password']"));
		pass.sendKeys("abc123");
		WebElement day=driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByValue("12");
		WebElement month=driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByIndex(2);
		WebElement year=driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1997");
		WebElement gender=driver.findElement(By.xpath("//input[@value='1']"));
		gender.click();
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("//button[@id='u_0_14']"));
		login.click();
		
		
	}
}
