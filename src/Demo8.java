import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.Driver",".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukari.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String>wins=driver.getWindowHandles();
		//wins.remove(parent);
		//System.out.println(driver.getClass());
		/*for(String win:wins)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			driver.close();
		}*/
		ArrayList<String> al=new ArrayList<>(wins);
		for(int i=al.size()-1;i>=0;i--)
		{
			driver.switchTo().window(al.get(i));
			Thread.sleep(2000);
			driver.close();
		}
		

	}

}
