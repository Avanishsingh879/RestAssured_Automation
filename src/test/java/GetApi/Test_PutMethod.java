package GetApi;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_PutMethod {
	
	
	@Test
	  public void ValidateTest4() {
		
		
		JSONObject jsondata=new JSONObject();
		jsondata.put("name", "Anil");
		jsondata.put("job", "Developer");
		
		RestAssured.baseURI="https://reqres.in/api/users/52";
		 RestAssured.given().header("Content-Type","application/json").contentType(ContentType.JSON).
		 body(jsondata.toJSONString()).
		 when().put().
		 then().statusCode(200).log().all();
		 
		
		
		
		  
		  
		  
	  }

}
