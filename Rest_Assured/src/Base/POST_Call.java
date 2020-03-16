package Base;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
//import org.json.simple.JSONObject;
import io.restassured.specification.RequestSpecification;

public class POST_Call 
{
	@Test
	public void Create_New_Record() 
	{
	         RequestSpecification request =RestAssured.given();
	         
	         request.header("Content-type","application/json");
	         
	         JSONObject objjson = new JSONObject();
	         
	         objjson.put("first_name", "Rest_Ankit_new");
	         objjson.put("middle_name", "Rest_K_new");
	         objjson.put("last_name", "Rest_Srv_new");
	         objjson.put("date_of_birth", "01/07/1994");
	        
	         
	         request.body(objjson.toString());
	         
	         //https://thetestingworldapi.com/api/studentsDetails
	         
	         Response objresponse=request.post("http://thetestingworldapi.com/api/studentsDetails");
	         
	         var response_body =objresponse.asString();
	         
	         System.out.println("The response body is"+"  "+response_body);
	         
	         var status_code =objresponse.getStatusCode();
	         
	         System.out.println("The response code is"+"  "+status_code);
	     
		
            
	}
	

}
