package testCases;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyData;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

	

public class GetBookingIds_RestfulBookerUsingBDDStyle {
	
	String baseUri = "https://restful-booker.herokuapp.com";
	
  
  public void GetBookingIds_VerifyStatusCode() {
	  
	  //Given
	  RestAssured.given()
	  		.baseUri(baseUri)
	  //When
	  .when()
	  		.get("/booking")
	  //Then
	  .then()
	  		.statusCode(200)
	  		.statusLine("HTTP/1.1 200 OK")
	  		//verify count of the booking
	  		.body("bookingid", Matchers.hasSize(15))
	  		//verify that the 3rd element is equal to 9
	  		.body("bookingid[3]", Matchers.equalTo(7));
  			  
  }
  
  
  
  public void GetSpecificElementValue() {
          
      given()
      .when()
          .get("http://ergast.com/api/f1/2017/circuits.json")
      .then()
          .assertThat()
          .body("MRData.CircuitTable.Circuits.circuitId",hasSize(20))
          .body("MRData.CircuitTable.Circuits.circuitId", hasItem("hungaroring"))
          .body("MRData.series", equalTo("f1"));
          
      
  }
  
  

  public void Gettest() {
          
	  RequestSpecification req = RestAssured.given();
	  Response resp = req.get("http://ergast.com/api/f1/2017/circuits.json");
	  
	  ResponseBodyData res = resp.getBody();
	  //print the reponse 
	  System.out.println(res.asString());
      
      
  }
  
  @Test
  public void test_ResponseHeaderData_ShouldBeCorrect() {
          
      given().
      when().
          get("http://ergast.com/api/f1/2017/circuits.json").
      then().
          assertThat().
          statusCode(200).
      and().
          contentType(ContentType.JSON).
      and().
          header("Content-Length",equalTo("4567"));
  }
  
  
}
