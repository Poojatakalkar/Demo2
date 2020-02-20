import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://actitime.jmr.co.za/actitime/login.do");
		WebElement user=driver.findElement(By.name("username"));
		user.sendKeys("admin");
		WebElement pass=driver.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		login.sendKeys();
		String s1="https://actitime.jmr.co.za/actitime/login.do";
		String s2="https://actitime.jmr.co.za/actitime/login.do";
		if(s1.equals(s2))
		{
			System.out.println("login unscessfully");
		}
		else
		{
			System.out.println("Login sucessfully");
		}
	}

}
