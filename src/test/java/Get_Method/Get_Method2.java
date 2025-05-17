package Get_Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Method2 {
	
	
	
	
	
	@Test
	  public void test1() {
		
		Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("Response Code:" +response.getStatusCode());
		System.out.println("Response Code:" +response.statusLine());
		System.out.println("Response Code:" +response.getHeader("Transfer-Encoding"));
		System.out.println("Response Code:" +response.getTime());
		System.out.println("Response Code:" +response.getBody().toString());
		
		int actual=response.getStatusCode();
		int exp=200;
		Assert.assertEquals(actual, exp);  
	  }
	@Test
	  public void Test2() {
		
		//given when Then
		
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RestAssured.given()
		.queryParam("page", "2")
		.when().get().
		then().statusCode(200);
		
	}

}
