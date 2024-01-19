package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.CreateUserAccountPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateUserAccountStep extends BaseClass {
	protected static CreateUserAccountPage createuseraccountPage;
	
	
	@Given("User is on Create Account Page")
	public void user_is_on_create_account_page() {
		BaseClass.intilazation();
	   
	}
	@When("User enter valid Username")
	public void user_enter_valid_username() {
		 createuseraccountPage = new CreateUserAccountPage();
		 createuseraccountPage.personalDetailsFunactionality("Kajal@gmail.com");
	}


}
