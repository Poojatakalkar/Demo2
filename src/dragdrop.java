import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		WebElement ele=driver.findElement(By.xpath("//iframe[@ class='demo-frame']"));
		driver.switchTo().frame(ele);
		WebElement login=driver.findElement(By.id("slider"));
		Actions a=new Actions(driver);
		a.dragAndDropBy(login, 150, 0).perform();
		
		
	}


}
