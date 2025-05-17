package Get_Method;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Get_Method_GivenFormet {
	
	
	
	///given when then
	@Test
	public void Test1() {
		
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RestAssured.given()
		.queryParam("Pages", "2")
		.when().get()
		.then()
		.statusCode(200);
		
		
		
	}

}
