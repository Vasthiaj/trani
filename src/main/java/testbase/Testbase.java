package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Activitycapture;

public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver eve;
	public static Activitycapture acp;
	
	public Testbase()
	{
		try {
			FileInputStream ipconfig=new FileInputStream("./src/main/java/config/appconfig.properties");
			prop =new Properties();
			prop.load(ipconfig);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		
		public static void initialization()
		{
			
			String broname=prop.getProperty("BROWSER");
			if(broname.equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				
			}
			
			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
			driver.get(prop.getProperty("URL"));
			
			// for log write
			
			acp=new Activitycapture();
			
			eve=new EventFiringWebDriver(driver);
			
			eve.register(acp);
			
			driver=eve;
		}
		
		
		
		
	}

	
	
