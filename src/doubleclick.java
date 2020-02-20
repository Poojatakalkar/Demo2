import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	Actions a=new Actions(driver);
	//WebElement cl=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	//a.doubleClick(cl).perform();
	WebElement ele=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	a.contextClick(ele).perform();
    
	
}
}