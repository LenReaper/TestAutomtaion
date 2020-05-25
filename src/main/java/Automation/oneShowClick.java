package Automation;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class oneShowClick {
	
	WebDriver driver;
	ResourceBundle res = ResourceBundle.getBundle("OR");
	
	public oneShowClick(WebDriver driver) {
		this.driver=driver;
	}
	
	public void gladiatorClick() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(10000);
		driver.findElement(By.xpath(res.getString("gladiatorElement"))).click();
		//Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement more = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(res.getString("moreElement"))));
		more.click();
		driver.findElement(By.xpath(res.getString("addToList"))).click();
		driver.findElement(By.xpath(res.getString("mailLogin"))).click();
	}

}
