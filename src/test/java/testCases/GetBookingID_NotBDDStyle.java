package testCases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyData;
import io.restassured.specification.RequestSpecification;

public class GetBookingID_NotBDDStyle {
	
	
	
	
  @Test
  public void GetBookingIds_VerifyStatusCode() {
	  
	  RestAssured.baseURI = "https://restful-booker.herokuapp.com";
	  RequestSpecification req = RestAssured.given();
	  Response resp = req.get("/booking");
	  
	  
	  ResponseBodyData res = resp.getBody();
	  //print the reponse 
	  System.out.println(res.asString());
	 
	  
	  
	  
	  
  }
}
