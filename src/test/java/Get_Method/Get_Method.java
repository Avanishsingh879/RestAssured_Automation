package Get_Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Method {
	
	
	@Test
	public void Test1() {
		
		Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("Response Code:" + response.getStatusCode());
		System.out.println("Response Body"+ response.getBody().toString());
		System.out.println("Response Time"+ response.getTime());
		System.out.println("Response Header"+ response.getHeader("Content-Type"));
		
		int ExpStatusCode=200;
		int ActStatusCode=response.getStatusCode();
		Assert.assertEquals(ExpStatusCode, ActStatusCode);
		
		
	}
	
	

}
