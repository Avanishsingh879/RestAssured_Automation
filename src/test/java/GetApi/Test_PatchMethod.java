package GetApi;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_PatchMethod {
	
	
	
	   @Test
	   public void Test4() {
		   
		   
		   JSONObject jsondata=new JSONObject();
		   jsondata.put("name","Java");
		   jsondata.put("job", "Teacher");
		   
		   RestAssured.baseURI="https://reqres.in/api/users/52";
		   RestAssured.given().header("Contant-Type","application/json").contentType(ContentType.JSON).
		   body(jsondata.toJSONString()).
		   when().patch().then().statusCode(200).log().all();
		   
		   
	   }

}
