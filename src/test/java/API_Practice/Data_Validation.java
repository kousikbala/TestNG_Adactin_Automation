package API_Practice;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Data_Validation {
	
	@Test
    public void data_Valodation() {

		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("api/users/2");
		
		String string = response.asString();
		
		System.out.println(string);
		
		int actual_code = response.getStatusCode();
		
		Assert.assertEquals(200, actual_code);
		
		System.out.println("data validation");
		
		
		
	}
	
	
	
	

}
