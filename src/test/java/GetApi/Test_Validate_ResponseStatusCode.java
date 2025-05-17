package GetApi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


public class Test_Validate_ResponseStatusCode {
	
	
	//////Validate Response Status Code ,Error status code,Status line
	
	
	    @Test(enabled=false)
	    public void Test6() {
	    	
	    	
	    RestAssured.baseURI="https://reqres.in/api/users/2";
	    RequestSpecification requrstspec=  RestAssured.given();
	    Response res=requrstspec.get();
	    
	    int statuscode=res.statusCode();
	    //Validate ActualStatus code with Expected
	    
	    Assert.assertEquals(statuscode/* actual status code*/,200/* Excepted status code*/);
	        	
	    }
	    
	    @Test(enabled=false)
	    public void verify_StatusLine() {
	    	
	    	
	    	RestAssured.baseURI="https://reqres.in/api/users/2";
	    	RequestSpecification resquestspec=RestAssured.given();
	    	
	    	Response ress=resquestspec.get();
	    	String ststusLine=ress.statusLine();
	    	Assert.assertEquals(ststusLine,"HTTP/1.1 200 OK", "Incorrect statusLine Returned");
	    	
	    	
	    }
	    
	    //////////////////////////////////////////////
	    
	    ///verify status code using ValidableResponse 
	    @Test
	    public void Verify_StatusCode() {
	    	
	    	RestAssured.baseURI="https://reqres.in/api/users/2";
	    	RequestSpecification resq=RestAssured.given();
	    	Response resd=resq.get();
	    	ValidatableResponse  validate=resd.then();
	    	
	    	//statusCode
	    	validate.statusCode(200);
	    	validate.statusLine("HTTP/1.1 200 OK");
	    	
	    	
	    	
	    	
	    }

}
