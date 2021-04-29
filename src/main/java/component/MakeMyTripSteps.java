package component;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import page.MakeMyTripDashboard;

public class MakeMyTripSteps extends MakeMyTripDashboard {

	public MakeMyTripSteps(WebDriver driver) {
		super(driver);
	}

	public void validateMakeMyTripDashboard(String expectedVal) {
		Assert.assertTrue(getTitle().contains(expectedVal));
	}

	public void enterFromCityVal(String cityName) {
		clickOnFromCity();
		enterValInfromCityTextField(cityName);
		selectFromSuggestionListBasedOnCityName(cityName);
	}

	public void enterToCityVal(String cityName) {
		clickOnToCity();
		enterValInToCityTextField(cityName);
		selectFromSuggestionListBasedOnCityName(cityName);
	}

	public void selecttheTravellerClass() {
		clickOnTravellersField();
		clickTravellerClass();
		clickOnApplyButton();
	}

	public void selectDepartureDate() {
		clickOnDepartureField();
		randonlyselectDepartureOrReturnDate();
	}

	public void selectReturnDate() {
		clickOnReturnField();
		randonlyselectDepartureOrReturnDate();
	}

	public boolean validateFlightSearchPageIsLandedSuccessfully(String fromCity, String toCity) {
		waitForflightSearchHeaderToBeVisible();
		List<String> arrayval = getCityVal();
		return arrayval.contains(fromCity) && arrayval.contains(toCity);
	}
}
