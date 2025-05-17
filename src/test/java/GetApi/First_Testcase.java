package GetApi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class First_Testcase {
	
	public class FirstTestCase_callGetApi {
		
		///API RestAssured 
		
		//GetResponse
		
		@Test
		public void Test1() {
			
			Response res=RestAssured.get("https://reqres.in/api/users/2");
			System.out.println(res.asString());
			//System.out.println(res.getStatusCode());
			
			
			
			
			
			
		}

	}
}
