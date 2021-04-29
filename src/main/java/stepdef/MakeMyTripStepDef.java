package stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import component.BaseClass;
import component.MakeMyTripSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class MakeMyTripStepDef {

	MakeMyTripSteps steps;

	@Given("^user is on \"([^\"]*)\" Dashboard Page$")
	public void user_is_on_Dashboard_Page(String expectVal) throws Throwable {
		WebDriver driver = new BaseClass().getDriver();
		steps = new MakeMyTripSteps(driver);
		steps.validateMakeMyTripDashboard(expectVal);
	}

	@When("^user select One Way Trip$")
	public void user_select_One_Way_Trip() throws Throwable {
		steps.clickOnOneWayTripRadioBtn();
	}

	@When("^user select origin city$")
	public void user_select_origin_city() throws Throwable {
		steps.enterFromCityVal("Mumbai");
	}

	@When("^user select destination city$")
	public void user_select_destination_city() throws Throwable {
		steps.enterToCityVal("Bengaluru");
	}

	@When("^user select departure date$")
	public void user_select_departure_date() throws Throwable {
		steps.selectDepartureDate();
	}

	@When("^user select return date$")
	public void user_select_return_date() throws Throwable {
		steps.selectReturnDate();
	}

	@When("^user select traveller&class$")
	public void user_select_traveller_class() throws Throwable {
		steps.selecttheTravellerClass();
	}

	@When("^user clicks on Searh Button$")
	public void user_clicks_on_Searh_Button() throws Throwable {
		steps.clickOnSearch();
	}

	@Then("^user will land on Search Result Page$")
	public void user_will_land_on_Search_Result_Page() throws Throwable {
		Assert.assertTrue("PROBLEM : User is not landed Search Result Page",
				steps.validateFlightSearchPageIsLandedSuccessfully("Mumbai", "Bengaluru"));
	}

}
