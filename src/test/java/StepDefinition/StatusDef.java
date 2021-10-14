package StepDefinition;

import Pages.AddEmpPage;
import Pages.DashBoardPage;
import Pages.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StatusDef {

	@Given("Already logged into Orange Hrm and inside Add Employee Section")
	public void already_logged_into_orange_hrm_and_inside_add_employee_section() {
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

	@When("I entered Full Name, Employee ID, Add Photograph, Click on Login Details")
	public void i_entered_full_name_employee_id_add_photograph_click_on_login_details() {
	    // Write code here that turns the phrase above into concrete actions
		try {
	   AddEmpPage.AddName();
	   AddEmpPage.AddEmpID();
	   AddEmpPage.CheckBox();
		}
		catch(Exception e) {
			System.out.println("Error Here");
		}
	}

	@When("Enter Username, Password, Confirm Password and select status as Enabled")
	public void enter_username_password_confirm_password_and_select_status_as_enabled() {
	    // Write code here that turns the phrase above into concrete actions
		try {
	    AddEmpPage.uname();
	    AddEmpPage.Pass();
	    AddEmpPage.CPass();
	    AddEmpPage.Status();
		}
		catch(Exception e) {
			System.out.println("Error Here");
		}
	}

	@When("Click on Save Button")
	public void click_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
		try {
		AddEmpPage.save();
		}
		catch(Exception e) {
			System.out.println("Error Here");
		}
	}

	@Then("New Employee should add")
	public void new_employee_should_add() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
