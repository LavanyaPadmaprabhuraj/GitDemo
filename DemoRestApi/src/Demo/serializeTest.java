package Demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import java.util.ArrayList;
import java.util.List;

import Pojo.AddPlace;
import Pojo.Location;


public class serializeTest {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		AddPlace AP=new AddPlace();
		AP.setAccuracy(50);
		AP.setName("Lavs Home");
		AP.setPhone_number("(+91) 807 326 1973");
		AP.setAddress("Begur road Bangalore");
		AP.setWebsite("https://rahulshettyacademy.com");
		AP.setLanguage("EN,KA,AP");
		
		
		List<String> myList=new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		
	    AP.setTypes(myList);
		
		Location l=new Location();
	
		l.setLat(-38.383494);
		l.setLng(33.427362);
		
		AP.setLocation(l);
		
		
		
		 Response res =given().log().all().queryParam("key", "qaclick123")
				.body(AP)
		.when().post("/maps/api/plac/add/json").
		then().log().all().assertThat().statusCode(404).extract().response();
		
      String response=res.asString();
      System.out.println(response);
	}

}
