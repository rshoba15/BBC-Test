package commonMethods;

import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;

public class WebConnector {
	
	public static WebDriver browser;
	
	public static String base_url="http://www.bbc.co.uk/blogs/test/entries/f5f3031a-1a29-44ee-b2f8-86e78bfd57b0#comments";
	
	public static  String browserType="chrome";
	
	public static Properties prop=new Properties();
	
	static Random rand = new Random();
	public static String commenttext="Test1"+rand.nextInt();
	
		
	

}
