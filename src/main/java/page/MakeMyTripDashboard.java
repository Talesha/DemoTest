package page;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTripDashboard {

	WebDriver driver;

	public MakeMyTripDashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='root']//li[@data-cy='oneWayTrip']//span/..")
	private WebElement oneWayTripRadioBtn;

	@FindBy(xpath = "//*[@id='fromCity']/..")
	private WebElement fromCityField;

	@FindBy(xpath = "//*[@id='fromCity']/ancestor::div[contains(@class,'activeWidget')]//input[@placeholder='From']")
	private WebElement fromCityTextField;

	@FindBy(xpath = "//div[contains(@class,'container--first')]//ul//p[contains(@class,'blackText')]")
	private List<WebElement> listOfFromOrToCityName;

	@FindBy(xpath = "//div[contains(@class,'container--first')]//ul//p[contains(@class,'greyText')]")
	private List<WebElement> listOfFromCityOrToCityAirportName;

	@FindBy(xpath = "//*[@id='toCity']/..//span")
	private WebElement toCityField;

	@FindBy(xpath = "//*[@id='toCity']/ancestor::div[contains(@class,'activeWidget')]//input[@placeholder='To']")
	private WebElement toCityTextField;

	@FindBy(xpath = "//*[@id='departure']/..//span")
	private WebElement departureField;

	@FindBy(xpath = "//*[@data-cy='returnArea']/..//span")
	private WebElement returnField;

	@FindBy(xpath = "//*[@id='travellers']/..//span")
	private WebElement travellersField;

	@FindBy(xpath = "//ul[contains(@class,'classSelect')]//li")
	private List<WebElement> listOfTravelClass;

	@FindBy(xpath = "//button[text()='APPLY']")
	private WebElement applyButton;

	@FindBy(xpath = "//a[text()='Search']")
	private WebElement search;

	@FindBy(xpath = "//div[contains(@class,'DayPicker-Day') and @aria-disabled='false']")
	private List<WebElement> listOfEnabledDay;

	@FindBy(xpath = "//div[contains(@class,'autopop__wrap')]")
	private WebElement autoPopUpWrap;

	@FindBy(xpath = "//li[@data-cy='account']")
	private WebElement loginDropField;

	@FindBy(xpath = "//div[@class='listingRhs']/p")
	private WebElement flightSearchHeader;

	@FindBy(xpath = "//div[@class='listingRhs']/p/b")
	private List<WebElement> flightSearchVal;

	public void clickOnTravellersField() {
		travellersField.click();
	}

	public void clickTravellerClass() {
		Random rand = new Random();
		int val = rand.nextInt(listOfTravelClass.size());
		listOfTravelClass.get(val).click();
	}

	public void clickOnApplyButton() {
		applyButton.click();
	}

	public void clickOnSearch() {
		search.click();
	}

	public void clickOnOneWayTripRadioBtn() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
			wait.until(ExpectedConditions.visibilityOf(autoPopUpWrap));
			loginDropField.click();
		} catch (Exception ele) {
			System.out.println("Element not available");
		}
		wait.until(ExpectedConditions.elementToBeClickable(oneWayTripRadioBtn));
		if (!oneWayTripRadioBtn.getAttribute("class").equals("selected")) {
			oneWayTripRadioBtn.click();
		}
	}

	public void clickOnFromCity() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(fromCityField));
		fromCityField.click();
	}

	public void clickOnToCity() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(toCityField));
		toCityField.click();
	}

	public void enterValInfromCityTextField(String valToEnter) {
		fromCityTextField.sendKeys(valToEnter);
	}

	public void enterValInToCityTextField(String valToEnter) {
		toCityTextField.sendKeys(valToEnter);
	}

	public void selectFromSuggestionListBasedOnCityName(String expectVal) {
		for (WebElement ele : listOfFromOrToCityName) {
			if (ele.getText().contains(expectVal)) {
				ele.click();
				break;
			}
		}

	}

	public void selectFromSuggestionListBasedOnAirportName(String expectVal) {
		for (WebElement ele : listOfFromCityOrToCityAirportName) {
			if (ele.getText().contains(expectVal)) {
				ele.click();
				break;
			}
		}

	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void randonlyselectDepartureOrReturnDate() {
		Random rand = new Random();
		int val = rand.nextInt(listOfEnabledDay.size());
		listOfEnabledDay.get(val).click();
	}

	public void clickOnDepartureField() {
		departureField.click();
	}

	public void clickOnReturnField() {
		returnField.click();
	}

	public List<String> getCityVal() {
		List<String> val = new ArrayList<>();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (WebElement ele : flightSearchVal) {
			System.out.println(ele.getText());
			val.add(ele.getText());
		}
		return val;
	}

	public boolean waitForflightSearchHeaderToBeVisible() {
		return flightSearchHeader.isDisplayed();
	}
}
