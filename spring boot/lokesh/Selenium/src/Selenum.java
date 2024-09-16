import java.awt.AWTException; 
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenum {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\loki\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com");
		driver.findElement(By.name("q")).sendKeys("bank",Keys.ENTER);
		//String parent=driver.getWindowHandle();
		
		driver.findElement(By.xpath(".//a[@class=\"v-align-middle\"]")).click();
	   
			
	       try {
	            Thread.sleep(120);
	            Robot r = new Robot();
	  
	            // It saves screenshot to desired path
	            String path = "D:// Shot.jpg";
	  
	            // Used to get ScreenSize and capture image
	            Rectangle capture = 
	            new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	            BufferedImage Image = r.createScreenCapture(capture);
	            ImageIO.write(Image, "jpg", new File(path));
	            System.out.println("Screenshot saved");
	        }
	        catch (AWTException | IOException | InterruptedException ex) {
	            System.out.println(ex);
	        }
	    }
}


