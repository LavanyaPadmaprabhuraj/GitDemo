
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;

import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import Files.payload;
import Pojo.LearningdemoAddplace;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
public class learnindemo {

	public static void main(String[] args) {
	
        //https://rahulshettyacademy.com/maps/api/place/add/json?key=qaclick123
		
		RequestSpecification RequestResponse=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123").
				setBody(payload.Addplace()).setContentType(ContentType.JSON).build();
		ResponseSpecification Response=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		
		RequestSpecification t1=given().spec(RequestResponse);
		LearningdemoAddplace t2 =t1.when().post("maps/api/place/add/json?key=qaclick123").
		then().log().all().spec(Response).body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)").
		extract().response().as(LearningdemoAddplace.class);
		
	    String Placeid=(t2.getPlace_id());
	    String Id =t2.getId();	    
	    
	    //Add place  -->PUT
	    
	  RequestSpecification  ResAddplace=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123").addQueryParam("place_id",Placeid).build();
		
	    String Address="NewYork USA";
	    
	    RequestSpecification T11=given().log().headers().spec(ResAddplace). body("{\r\n"
	       		+ "\"place_id\":\""+Placeid+"\",\r\n"
	       		+ "\"address\":\""+Address+"\",\r\n"
	       		+ "\"key\":\"qaclick123\"\r\n"
	       		+ "}");
	    
	    T11.when().put("maps/api/place/update/json").then().log().all().spec(Response).extract().response();	    
		
		//GET  /maps/api/place/update/json
	    
//	    RequestSpecification  ResAcess=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123").addQueryParam("id",Id).build();
		
	    RequestSpecification T21=given().log().all().spec(ResAddplace);
	    String T22=T21.when().get("/maps/api/place/get/json").
	    then().log().all().spec(Response).extract().response().asString();
	    
	    JsonPath js=new JsonPath(T22);
	    System.out.println(js.getString("address"));
		
		
		
	}

}
