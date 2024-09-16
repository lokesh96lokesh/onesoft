import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	211import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class WaitTest {
		public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\loki\\Downloads\\Compressed\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			List<WebElement> list = driver.findElements(By.name("q"));
			System.out.println(list.size());
			
			driver.get("https://github.com");
			driver.findElement(By.name("q")).sendKeys("bank",Keys.ENTER);
				
	}
}
