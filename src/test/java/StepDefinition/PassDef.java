package StepDefinition;

import Pages.AddEmpPage;
import Pages.DashBoardPage;
import Pages.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PassDef {

	@Given("I am already logged in Orange Hrm and inside Add Employee Section")
	public void i_am_already_logged_in_orange_hrm_and_inside_add_employee_section() {
	    // Write code here that turns the phrase above into concrete actions
		try {
	   loginpage.login();
	   DashBoardPage.pim();
	   AddEmpPage.AddEmp();
		}
		catch(Exception e) {
			System.out.println("Error Here");
		}
	}

	@When("Enter Username, Password and Confirm Password")
	public void enter_username_password_and_confirm_password() {
	    // Write code here that turns the phrase above into concrete actions
		try {
	  AddEmpPage.uname();
	  AddEmpPage.Pass();
	  AddEmpPage.CPass();
		}
		catch(Exception e)
		{
			System.out.println("Error Here");
		}
	}

	@When("I am Clicking on Save Button")
	public void i_am_clicking_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
		try {
	    AddEmpPage.save();
		}
		catch(Exception e) {
			System.out.println("Error Here");
		}
	}

	@Then("New Employee should get add here.")
	public void new_employee_should_get_add_here() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

}
