package GetApi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_GetMethod1 {
	
	@Test
	public void Validate_Testcase1() {
		
		Response res=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("Response code:" +res.getStatusCode());
		System.out.println("Response Body:" +res.getBody());
	
		
	}

}
