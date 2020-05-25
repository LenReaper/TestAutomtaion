package stepDefinitions;

import java.io.IOException;
import java.util.ResourceBundle;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Automation.baseClass;
import Automation.oneShowClick;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.screenShot;

public class GladiatorHindiMovie extends baseClass{
	WebDriver driver;
	ResourceBundle resb = ResourceBundle.getBundle("OR");
	
	@Given("^User is in home page$")
	public void user_is_in_home_page() throws IOException{
		driver = baseClassMethod();
	    System.out.println("User has traversed to home page");
	    screenShot.screenshot(driver, "HomePage");
	}

	@When("^User goes to Gladiator movie \\(hindi\\) and clicks it$")
	public void user_goes_to_Gladiator_movie_hindi_and_clicks_it() throws InterruptedException, IOException{
		oneShowClick oneshow = new oneShowClick(driver);
		oneshow.gladiatorClick();
	    System.out.println("Gladiator clicked and tried addding to Watchlist");
	    screenShot.screenshot(driver, "Add to watchlist");
	}

	@Then("^Opertion should be successful$")
	public void opertion_should_be_successful() throws IOException{
		Assert.assertEquals(driver.getTitle(), resb.getString("pageTitle"));
	   System.out.println("Operation successful");
	   screenShot.screenshot(driver, "Success!!");
	}

}
