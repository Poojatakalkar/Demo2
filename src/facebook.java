import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
				WebElement day=driver.findElement(By.id("day"));
				Select s=new Select(day);
				s.selectByValue("13");
				WebElement month=driver.findElement(By.id("month"));
				Select s1=new Select(month);
				s1.selectByIndex(2);
				WebElement year=driver.findElement(By.id("year"));
				Select s2=new Select(year);
				s2.selectByVisibleText("1998");
				List<WebElement> days=s.getOptions();
				
				for(WebElement d:days)
				{
					System.out.println(d.getText());
				}


	}
}
