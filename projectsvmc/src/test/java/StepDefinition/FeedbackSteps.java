package StepDefinition;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeedbackSteps {
	
	WebDriver driver;
	//System.setProperty("webdriver.chrome.driver", "path of chrome driver");
	
	@Given("user is on feedback page")
	public void user_is_on_feedback_page() {

		System.out.println("User is on feedback page");
		
	}

	@When("user enters all the mandatory details on feedback page")
	public void user_enters_all_the_mandatory_details_on_feedback_page() {
	    
		System.out.println("User enter mandatory details like Candidate ID, Name, Event, Rating and Comments");
		
	}

	@When("user clicks on Submit feedback button")
	public void user_clicks_on_submit_feedback_button() {

		System.out.println("User clicks on Submit button");
		
	}

	@Then("feedback is sent to registered candidate successfully")
	public void feedback_is_sent_to_registered_candidate_successfully() {

		System.out.println("Feedback is sent to registered candidate successfully");
		
	}


}
