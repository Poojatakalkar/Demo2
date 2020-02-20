import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Selenium/doc1.html");
		
				WebElement ele=driver.findElement(By.id("b"));
				Select s=new Select(ele);
				List<WebElement> val=s.getOptions();
				if(s.isMultiple())
					for(WebElement vals:val)
					{
						s.selectByValue(vals.getText());
						Thread.sleep(2000);
					}
				System.out.println("=============================================================");
				List<WebElement> opts=s.getAllSelectedOptions();
				for (WebElement opt : opts) {
					System.out.println(opt.getText());
					
				}
				//System.out.println(s.getFirstSelectedOption().getText());
			/*	for(WebElement vals:val)
				{
					s.deselectByValue(vals.getText());
					Thread.sleep(2000);
				}*/
				s.deselectAll();
			

	}
}
