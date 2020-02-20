import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://naukri.com/");
		
		System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String>wins=driver.getWindowHandles();
        wins.remove(parent);
        driver.close();
		//System.out.println(driver.getClass());
		for(String win:wins)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			//System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			
			//driver.close();
		}
		/*ArrayList<String> al=new ArrayList<>(wins);
		for(int i=al.size()-1;i>=0;i--)
		{
			driver.switchTo().window(al.get(i));
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
		}*/
		

	}

}
