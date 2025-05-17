package RestAssured;

import static io.restassured.RestAssured.*;;

public class BDD_GetMethod {
	
	
	@org.testng.annotations.Test
	public void Test() {/////BDD Formet,Given,When and Than
		
		baseURI="https://reqres.in/api/users";////RestAssured is Class
		 given()
		.queryParam("page", "2")
		.when().get().
		then().statusCode(200);
		
		
		
		
		
	}

}
