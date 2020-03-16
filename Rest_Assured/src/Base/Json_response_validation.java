package Base;
import io.restassured.RestAssured;
//import io.restassured.response.Response;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;


public class Json_response_validation 
{
	@BeforeClass
	public void Setup() 
	{	
	  
		RestAssured.baseURI="http://thetestingworldapi.com";	
		
	}
	@Test
	public void Validate_Json_Response() 
	{
	given()
   .param("id", "161075")
   .when()
   .get("/api/studentsDetails")
   .then()
   .statusCode(200);
   
   //.and()
   //body("first_name",equalTo("mark4"));
	
	System.out.println("JSON validation completed");
	}
   
	}
	
	
	
	
	
	
	

