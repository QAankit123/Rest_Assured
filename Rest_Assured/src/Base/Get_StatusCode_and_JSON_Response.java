package Base;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_StatusCode_and_JSON_Response 
{
	@Test(priority=0)
	public void Get_Response_Code() 
	{
	Response objresponse =	RestAssured.get("http://thetestingworldapi.com/api/studentsDetails/161075");

	var status_code=objresponse.getStatusCode();
	
	System.out.println("The status code is"+"  "+status_code);
	Assert.assertEquals(status_code, 200);
	
	}
	@Test(priority=1)
	public void Get_Response_Body() 
	{
		Response objresponse =	RestAssured.get("http://thetestingworldapi.com/api/studentsDetails/161075");
		
		var response_body =objresponse.asString();
		
		//objresponse.then().body("first_name",equalTo("")
		System.out.println("The response body is"+"  "+response_body);
		
	}
	
	
}
