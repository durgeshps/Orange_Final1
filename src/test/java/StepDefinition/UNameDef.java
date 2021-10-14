package StepDefinition;

import Pages.AddEmpPage;
import Pages.DashBoardPage;
import Pages.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UNameDef {

	@Given("Logged in Orange Hrm and inside Add Employee Section")
	public void logged_in_orange_hrm_and_inside_add_employee_section() {
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

	@When("Enter the Username")
	public void enter_the_username() {
	    // Write code here that turns the phrase above into concrete actions
		try {
	    AddEmpPage.uname();
		}
		catch(Exception e) {
			System.out.println("Error Here");
		}
	}

	@When("Click Save Button")
	public void click_save_button() {
	    // Write code here that turns the phrase above into concrete actions
		try {
	   AddEmpPage.save();
		}
		catch(Exception e) {
			System.out.println("Error Here");
		}
	}

	@Then("New Employee should be added here")
	public void new_employee_should_be_added_here() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
