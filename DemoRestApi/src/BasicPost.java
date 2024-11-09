import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.Assert;
import Files.Reusablemethods;
import Files.payload;


public class BasicPost {

	public static void main(String[] args) {
		
//given  - all input details
//when - Submit the API - resource ,http method
//Then - Validate the response
// Add place ->Update place with New Address ->Get place to validate if New address is present in response		
		

		
		RestAssured.baseURI ="https://rahulshettyacademy.com";
		String Response =given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(payload.Addplace()).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).and()
		.body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
         
		System.out.println(Response);
		
        JsonPath js =new JsonPath(Response);  //for parsing the Json -> it will take only string 
		
	
        String place_id=js.getString("place_id");
        String  Status =js.getString("status");
        
        System.out.println(place_id);
        
        System.out.println(Status);
        
        
  //Update the place   POST
        String Address="NewYork USA";
        
       given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").
       body("{\r\n"
       		+ "\"place_id\":\""+place_id+"\",\r\n"
       		+ "\"address\":\""+Address+"\",\r\n"
       		+ "\"key\":\"qaclick123\"\r\n"
       		+ "}")
       //body(payload.UpdatePlace())
       .when().put("maps/api/place/update/json")
       .then().log().all().statusCode(200).and().body("msg",equalTo("Address successfully updated"));
		
	//GET place	
		
       String getplaceRes=given().relaxedHTTPSValidation().log().all().queryParam("key", "qaclick123").queryParam("place_id",place_id)
       .when().get("maps/api/place/get/json")
       .then().assertThat().log().all().statusCode(200).extract().response().asString();
       
   	    JsonPath js1=Reusablemethods.rawToJson(getplaceRes);  //convert into json file
       
    
       String ActualAddress=js1.getString(" ");
       System.out.println(ActualAddress);
       
       Assert.assertEquals(ActualAddress, Address);

	}
}
