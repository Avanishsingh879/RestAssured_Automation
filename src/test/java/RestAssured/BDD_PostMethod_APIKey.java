package RestAssured;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class BDD_PostMethod_APIKey {
	
	@org.testng.annotations.Test
	public void Test() {
		
		JSONObject data=new JSONObject();
		data.put("Name", "AVanish");
		data.put("Job", "QA");
		
		RestAssured.baseURI="https://reqres.in/api/users";
		RestAssured.given().header("x-api-key","reqres-free-v1").
		contentType(ContentType.JSON).body(data.toJSONString()).
		when().post().
		then().statusCode(201).log().all();
	}

}
