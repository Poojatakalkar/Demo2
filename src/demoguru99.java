import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class demoguru99 {
	public static void main(String[] args) throws InterruptedException {
		

	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/v1/index.php");
	WebElement ele=driver.findElement(By.xpath("//iframe[@id='Video-iFrame-SekindoSPlayer5e4d1e202ea18']"));
	driver.switchTo().frame(ele);
	WebElement login=driver.findElement(By.id("slider"));//div[@id='transparentInner']
	
	Actions a=new Actions(driver);
	a.dragAndDropBy(login, 150, 0).perform();
	//WebElement mobile=driver.findElement(By.xpath("//input[@name='btnLogin']"));
	//mobile.click();
	//Alert a=driver.switchTo().alert();
	//Thread.sleep(2000);
	//System.out.println(a.getText());
	//a.accept();
}
}
