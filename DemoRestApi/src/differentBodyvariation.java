import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import Files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class differentBodyvariation {
	public static void main(String[] args) throws IOException {
	
	//given  - all input details
	//when - Submit the API - resource ,http method
	//Then - Validate the response
	// Add place ->Update place with New Address ->Get place to validate if New address is present in response (.body(new String(Files.readAllBytes(Paths.get("F:\\jsonFiles\\AddPlace.json")))))
			

//content of the file to String ->content of file can convert into Byte ->bye data to  String			-Files.readAllBytes(Paths.get
			RestAssured.baseURI ="https://rahulshettyacademy.com";
			String Response =given().log().body( ).queryParam("key","qaclick123").header("Content-Type","application/json")
			//.body(payload.Addplace())
			.body(new String(Files.readAllBytes(Paths.get("F:\\jsonFiles/AddPlace.json"))))
							
			.when().post("maps/api/place/add/json")
			.then().assertThat().statusCode(200).and()
			.body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
	         
			System.out.println(Response);
			
	        JsonPath js =new JsonPath(Response);  //for parsing the Json -> it will take only string 
			
		
	        String place_id=js.getString("place_id");
	        String  Status =js.getString("status");
	        
	        System.out.println(place_id);
	        
	        System.out.println(Status);

}
}