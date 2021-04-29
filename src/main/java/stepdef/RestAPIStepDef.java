package stepdef;

import org.junit.Assert;

import component.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fileop.payload;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAPIStepDef {
	String baseURL = BaseClass.getValFromProp("baseUrl");
	static Response response;

	@Given("^user is having endpoint URI$")
	public void user_is_having_endpoint_URI() throws Throwable {
		Assert.assertTrue(!baseURL.isEmpty());
	}

	@When("^user sends get request$")
	public void user_sends_get_request() throws Throwable {
		RestAssured.baseURI = baseURL;
		RequestSpecification request = RestAssured.given();
		request.queryParam("page", "2");
		request.header("Content-Type", "application/json");
		response = request.when().get("api/users");
	}

	@Then("^user will have (\\d+) response code$")
	public void user_will_have_response_code(int expectedVal) throws Throwable {
		Assert.assertEquals(response.getStatusCode(), expectedVal);
	}

	@When("^user send post request$")
	public void user_send_post_request() throws Throwable {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		response = request.body(payload.enterCred()).post("api/register");
	}

}
