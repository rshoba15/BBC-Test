package commonMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BrowserControl extends WebConnector{
	
	@Before
	public void openBrowser() throws Exception{
		
		//Read the Properties file with all the source data.
		
		FileInputStream fsp=new FileInputStream("C:\\Users\\rshob.SHOBAS\\Desktop\\Automation\\workspace\\bbc\\src\\test\\java\\resources\\source.properties");
		prop.load(fsp);
		
		//Test only for two browser types.
		
		if (browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "../bbc/src/test/java/resources/chromedriver.exe");
			browser=new ChromeDriver();
					
			
		}else if (browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "../bbc/src/test/java/resources/geckodriver.exe");
			browser=new FirefoxDriver();
			
			
		}
		browser.get(base_url);
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		
	}
	
	@After
	public void closeBrowser() throws Exception{
		browser.close();
	}

}
