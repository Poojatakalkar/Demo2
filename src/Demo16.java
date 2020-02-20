import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo16 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		WebElement user = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		user.click();
		//WebElement sale = driver.findElement(By.xpath("//li[@class='topnav_item saleunit']"));
		//System.out.println(sale.getText());
		//WebElement sale = driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
		//System.out.println(sale.getText());
		
		//WebElement dining = driver.findElement(By.xpath("//li[@class='topnav_item diningunit']"));
		//System.out.println(dining.getText());
		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		for (WebElement item : all) {
			System.out.println(item.getText());
		}
		
		
		
		
		
	}
}