package restassuredtest;

import io.restassured.RestAssured;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.junit.Assert;

public class RestAssuredDemo {

	public static void main(String[] args) {
		String baseUrl = "https://reqres.in";
		RestAssured.baseURI = baseUrl;
		RequestSpecification request = RestAssured.given();
		request.queryParam("page", "2");
		request.header("Content-Type", "application/json");
		Response response = request.when().get("api/users");
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
