import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://http://naukari.com/");
		//String title=driver.getTitle();
		//System.out.println(title);
		//System.out.println(driver.getCurrentUrl());
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String>wins=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(wins);
		for(int i=al.size()-1;i>=0;i--)
		{
			driver.switchTo().window(al.get(i));
			Thread.sleep(2000);
			driver.close();
		}
		
		//wins.remove(parent);
		//System.out.println(wins.getClass());
		
		/*for(String win:wins)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			driver.close();
		}*/
		
	}

}

