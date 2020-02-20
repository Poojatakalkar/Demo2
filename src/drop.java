import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		WebElement cl=driver.findElement(By.xpath("//a[@href='https://jqueryui.com/droppable/']"));
		cl.click();
		Actions a=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//iframe[@ class='demo-frame']"));
		driver.switchTo().frame(ele); 
		WebElement ele1=driver.findElement(By.id("draggable"));
		WebElement login=driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(ele1,login).perform();
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.id("droppable")).getText());

	}

}
