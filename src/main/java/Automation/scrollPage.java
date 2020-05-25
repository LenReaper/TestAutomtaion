package Automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollPage {

	WebDriver driver;
	
	public scrollPage(WebDriver driver) {
    	this.driver=driver;
    }
	
	public void scrolling() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
		System.out.println("Scrolled");
	}
}
