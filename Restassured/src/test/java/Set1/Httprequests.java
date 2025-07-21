package Set1;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Httprequests {
	
	@Test
	public void getUser()
	{
		Response response100=RestAssured.get("https://reqres.in/api/users?page=2");
		Response response1=RestAssured.get("https://reqres.in/api/users?page=2");
		Response response2=RestAssured.get("https://reqres.in/api/users?page=2");
		Response response3=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asString());
}

	

}
