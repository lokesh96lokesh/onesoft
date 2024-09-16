import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenum1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		driver.findElement(By.xpath(".//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		driver.findElement(By.name("q")).sendKeys("oppo-f21-pro-sunset-orange-128-gb",Keys.ENTER);
		driver.findElement(By.name("_4rR01T")).click();
	
	}
	}


