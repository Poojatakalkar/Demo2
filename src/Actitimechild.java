import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimechild {
public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement user=driver.findElement(By.name("username"));
		user.sendKeys("admin");
		WebElement pass=driver.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		WebElement login=driver.findElement(By.xpath("//a[@id='loginButton']"));
		login.click();
		Thread.sleep(2000);
		WebElement question=driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']"));
		question.click();
		WebElement content=driver.findElement(By.xpath("//li[@class='popup_menu_item']/parent::ul[@id='popup_menu_items_content']"));
		content.click();
		WebElement mes=driver.findElement(By.xpath("//div[@class='textArea noDragClass']"));
		mes.sendKeys("pooja");
		System.out.println(mes.getAttribu);
		
		//div[@class="textArea noDragClass"]
		

}
}