package Automation;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class baseClass {
	
	public WebDriver baseClassMethod()
	{
		WebDriver driver;
		ResourceBundle res = ResourceBundle.getBundle("config");
		if(res.getString("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			opt.setPageLoadStrategy(PageLoadStrategy.NONE);
			driver = new ChromeDriver(opt);
		}
		else if(res.getString("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(res.getString("browser").equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/IEdriver.exe");
			driver = new InternetExplorerDriver();
		}
		
		else
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get(res.getString("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	

}
