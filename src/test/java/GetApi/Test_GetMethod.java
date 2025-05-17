package GetApi;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import junit.framework.Assert;

public class Test_GetMethod {
	
	
	  ///
	   @Test
	   public void Validate_Testcase() {
		   
		  Response res=get("https://reqres.in/api/users?page=2");
		  System.out.println(res.getTime());
		  System.out.println(res.getStatusCode());
		  System.out.println(res.getHeader("Content-Type"));
		  System.out.println(res.getBody().asString());
		  
		  int ActualStatusCode=res.getStatusCode();
		  int ExeptedStatusCode=201;
		  
		  Assert.assertEquals(ExeptedStatusCode, ActualStatusCode);
		   
		   
	   }
	   
	   @Test()
	   public void Validate_Testcase2() {
		   
		   //given when then
		   
		   baseURI="https://reqres.in/api/users";
		   given()
		   .queryParam("page", 2)
		   .when().get().
		   then().statusCode(200);
		   
		   
		   
		   
		   
	   }

}
