package Base;

import io.restassured.RestAssured;
//import io.restassured.response.Response;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;



public class get_request_demo 
{  
   @BeforeClass
   public void setup() 
   {
	   
   RestAssured.baseURI="http://thetestingworldapi.com";
   //RestAssured.basePath="/api/studentsDetails"; 
	   
   }
   
   @Test
	public void status_code_validation() 
	{	
   given()
   .param("id","161075")
	
	.when()
	.get("/api/studentsDetails")
   
    .then()
    .statusCode(200);
	}
	
   @Test
	public void validate_response_body() {
	
	   //Response  obresponse =
   given()
	  .param("id","161075")
		
		.when()
.get("/api/studentsDetails")
	  
	   .then()
	   .statusCode(200)
	   .and()
	   .body("first_name.text",equalTo("mark4"));
	   
	}
	
	

}