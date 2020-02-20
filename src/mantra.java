import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mantra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(10000);
		
		List<WebElement> all = driver.findElements(By.xpath("//header[@id='desktop-header-cnt']/div"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menu : all) {
			String item=menu.getText();
			System.err.println(item);
			a.moveToElement(menu).build().perform();
					
	    Thread.sleep(2000);
		List<WebElement> submenu = driver.findElements(By.xpath("//a[contains(.,'"+item+"')]/parent::div/descendant::ul[@class='desktop-navBlock']"));

		for (WebElement subitem : submenu) {
			System.out.println(subitem.getText());

		}


	}
		
		/*System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	    List<WebElement> menu=driver.findElements(By.xpath("//header[@id='desktop-header-cnt']"));
	    Actions a=new Actions(driver);
	    Thread.sleep(2000);
	    for(WebElement list:menu)
	    {
	    	String item=list.getText();
	    	System.err.println(item);
	    	a.moveToElement(list).build().perform();
	    	
	    	Thread.sleep(2000);
	    	List<WebElement> submenu=driver.findElements(By.xpath("//a[contains(.,'"+item+"')]/parent::div/descendant::ul[@class='desktop-navBlock']/li"));
	    	
	    	for(WebElement sublist:submenu)
	    	{
	    		System.out.println(sublist.getText());
	    	}
	  
	    }*/
	    
	}
	
}
