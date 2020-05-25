package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class screenShot {

	public static void screenshot(WebDriver driver, String picName) throws IOException
	{
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File srcFile = ts.getScreenshotAs(OutputType.FILE);
	    File destFile= new File("./images/"+picName+".jpg");
	    FileUtils.copyFile(srcFile, destFile);
	}
	
}
