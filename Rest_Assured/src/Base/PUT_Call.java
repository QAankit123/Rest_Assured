package Base;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
//import org.json.simple.JSONObject;
import io.restassured.specification.RequestSpecification;



public class PUT_Call 
{	
               @Test
	           public void Update_A_Record() 
	           {
	        	  RequestSpecification request =RestAssured.given();
	        	  
	        	  request.header("Content-Type", "application/json" );
	        	  
	        	  JSONObject json = new JSONObject();
	        	  json.put("id","161075");
	        	  json.put("first_name", "Updated_First_Name");
	        	  json.put("last_name", "Updated_Last_Name");
	        	  
	        	  request.body(json.toString());
	        	  
	        	  Response objresponse = request.put("http://thetestingworldapi.com/api/studentsDetails/161075");
                  
	        	  var response_code=objresponse.getStatusCode();
	        	  
	        	   var response_body=objresponse.asString();
	        	  
	        	  System.out.println("The Status code is"+"    "+response_code);
	        	  
	        	  System.out.println("The response body is"+"    "+response_body);
	        	  
			   }
                      


}
