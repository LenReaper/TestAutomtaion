package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Automation.baseClass;
import Automation.scrollPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.screenShot;


public class scrollTest extends baseClass{

	WebDriver driver;
	
	 @Given("^User is on home page$")
    public void User_is_on_home_page(){
		driver= baseClassMethod();
		System.out.println("User on Home Page");
    }

    @When("^Initial steps are completed$")
    public void Initial_steps_are_completed(){
    	System.out.println("Initial steps completed");
    }

    @Then("^User is able to scroll successfully$")
    public void User_is_able_to_scroll_successfully(){
    	scrollPage element = new scrollPage(driver);
    	element.scrolling();
    }

    @And("^User tries to scroll through page$")
    public void User_tries_to_scroll_through_page() throws IOException{
    	screenShot.screenshot(driver, "scroll1");
    }

}
