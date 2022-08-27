package StepDefinition;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {

	WebDriver driver;
	//System.setProperty("webdriver.chrome.driver", "path of chrome driver");
		
	@Given("user is on registration page")
	public void user_is_on_registration_page() {
	    
		System.out.println("User is on registration details");
			
	}

	@When("user enters all the mandatory details")
	public void user_enters_all_the_mandatory_details() {
		
		System.out.println("User enter mandatory details like Name, Email, Phone num, Gender, Type of Event");
		
	}

	@When("user clicks on Submit button")
	public void user_clicks_on_submit_button() {
	    
		System.out.println("User clicks on Submit button");

	}

	@Then("event is registered successfully")
	public void event_is_registered_successfully() {
		
	    System.out.println("User is registered for the event");		

	}

	@Then("user is notified")
	public void user_is_notified() {
		
	    System.out.println("User is notified about the successful registration thru email/sms");
		
	}	
	
}
