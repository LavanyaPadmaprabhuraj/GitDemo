import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import Pojo.GetCourse;
import Pojo.api;
import Pojo.webAutomation;
public class oAuthTest {

	private static final List<String> String = null;

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		String AuthResponse=given().log().all()
		.formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		.formParam("grant_type", "client_credentials")
		.formParam("scope", "trust")
		.when().post("oauthapi/oauth2/resourceOwner/token").
		then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js=new JsonPath(AuthResponse);
		String Access_token=js.get("access_token");
		System.out.println("access_token : "+Access_token);
		
		
		//Other method
//        given() 
// .formParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")                
// .formParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
// .formParams("grant_type", "client_credentials")
// .formParams("scope", "trust")
// .when().log().all()
//.post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();
		
		//new Request 
		
		GetCourse gc=given().log().all().queryParam("access_token", Access_token).
		when().get("oauthapi/getCourseDetails").as(GetCourse.class);
		System.out.println(gc);
		
		System.out.println("********************Methods calling*************************");
		
		System.out.println(gc.getLinkedIn());
		System.out.println(gc.getInstructor());
		System.out.println(gc.getServices());
		System.out.println(gc.getExpertise());
		System.out.println(gc.getUrl());
		
	   int webAutomationCount=gc.getCourses().getWebAutomation().size();
	   System.out.println(webAutomationCount);
		
		System.out.println("********************////////////////////************************");
		
		String []ExpectedCourseTitles = {"Selenium Webdriver Java","Cypress","Protractor"}; // converting into list
		List<webAutomation> courseTitle=gc.getCourses().getWebAutomation();
		List<webAutomation> price=gc.getCourses().getWebAutomation();
		
		System.out.println(courseTitle);
		ArrayList<String> actual=new ArrayList<String>();
		
		for (int i=0;i<courseTitle.size();i++)
		{
			actual.add(courseTitle.get(i).getCourseTitle());
			}
		List<String> ExpectedArray=Arrays.asList(ExpectedCourseTitles);  // converting from array into arraylist list
		Assert.assertTrue(actual.equals(ExpectedArray));
	  
		
		List<api> apiCourses=gc.getCourses().getApi();
	  int count=gc.getCourses().getApi().size();
	  for (int i=0;i<count;i++)
		{
		  if(apiCourses.get(i).getCourseTitle().equalsIgnoreCase("Rest Assured Automation using Java"))
		  {
			  System.out.println("************@@@@@@@@@@@***************");
			  System.out.println(apiCourses.get(i).getPrice());
			  System.out.println(gc.getCourses().getMobile().get(i).getPrice());
		  }
		}
     
        
 
	}}

               

                
        
