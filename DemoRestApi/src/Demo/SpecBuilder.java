package Demo;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;


import java.util.ArrayList;
import java.util.List;

import Pojo.AddPlace;
import Pojo.Location;


public class SpecBuilder {

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
	    
	   RequestSpecification Requestres=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123").setContentType(ContentType.JSON).build();
	   
	   //-->RequestSpecBuilder/ResponseSpecBuilder    
	    ResponseSpecification Responseres=  new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
	   
	   RequestSpecification T1=given().spec(Requestres).body(AP);
	   
	  Response Response=T1.when().post("/maps/api/place/add/json").      // after what 
	   then().spec(Responseres).extract().response();
		
		

		
       String response=Response.asString();
      System.out.println(response);
	}

}
