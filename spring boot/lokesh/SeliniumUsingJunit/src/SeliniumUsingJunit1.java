
import org.junit.After; 
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

import static org.junit.Assert.assertEquals;

public class SeliniumUsingJunit1 {
	
	
	/*int a=10;
    int b=5;
    Object c;
    
    */
	
    @BeforeClass
    public static void SetUpClass()
    {
            //Initialization code goes here
            System.out.println("This is @BeforeClass annotation");
    }
 
   /*
    @Before
    public void SetUp()
    {   
            // Setting up the test environment
            System.out.println("This is @Before annotation");
    }
 
    
    @Test
    public void Addition()
    {   
            c= a+b;
            assertEquals(15,c);
            System.out.println("This is first @Test annotation method= " +c);
    }
 
    @Test
    public void Multiplication()
    {   
            c=a*b;
            assertEquals(50,c);
            System.out.println("This is second @Test annotation method= " +c);
    }*/
    @Test
    public  void  Selinium(){
    	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\loki\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com");
		driver.findElement(By.name("q")).sendKeys("ui",Keys.ENTER);
		driver.findElement(By.xpath(".//a[@data-hydro-click-hmac=\"91bb277ea7c14174241b5dc7da1a2e1c328135a937922c7500dd18ba6ec4712d\"]")).click();
}
    
   /* 
   @After
    public void TearDown()
    {
            // Cleaning up the test environment
            c= null;
            System.out.println("This is @After annotation");
    }*/
 
    
   @AfterClass
    public static void TearDownClass()
    {
            //Release your resources here
            System.out.println("This is @AfterClass annotation");
    }
   /*
    
    @Ignore
    public void IgnoreMessage()
    {
       String info = "JUnit Annotation Blog" ;
       assertEquals(info,"JUnit Annotation Blog");
       System.out.println("This is @Ignore annotation");
      
	}*/
}
