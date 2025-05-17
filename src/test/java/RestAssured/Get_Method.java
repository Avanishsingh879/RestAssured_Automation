package RestAssured;

import static io.restassured.RestAssured.*;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Method {
	
	///Get Method
	
	@org.testng.annotations.Test
	public void Test() {
		
		Response res=RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(res.asString());//Verify Response
		System.out.println(res.getStatusCode());///Response Code
		System.out.println(res.getBody().asString());//Response Body
		System.out.println(res.getTime());
		System.out.println(res.getHeader("Content-Type"));
		
		///////Validate Status code////
		int expStatuscode=200;
		int actualStatusCode=res.getStatusCode();
		Assert.assertEquals(expStatuscode, actualStatusCode);
		System.out.println("Status code Verify");
	}
	

}
