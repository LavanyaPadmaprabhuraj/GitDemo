import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

import java.io.File;

import Files.payload;
import groovy.util.logging.Log;

public class BugTest {

	public static void main(String[] args) {
		RestAssured.baseURI="https://lavanyapadmaprabhuraj.atlassian.net/";
		
//Create the issue in Jira		

		String Respose=given().header("Content-Type","application/json").header("Authorization","Basic bGF2YW55YXBhZG1hcHJhYmh1cmFqQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjAtTFRuTnhnVUFkdGpKZTROaGFHMzgyNmtZY0NxUFdiMFJPX0sweFVtNm9xV0ZoV3c2bEtuLUVLQ1FzVGZsb3VmWHE2SzdMOVRkRXhkNC1oOGVVR0U3R2JOY0dnamxqWm5DdllJZkdRR3U1OG9lR2tyNlNQMGdPSkR1dF94S1UxQ0YyTEpHbTRiQ2tsVmZNM18zRjhUSHVzbUZkQWprWnhHT3JuaDhkU0JLRFE9REVEOUExMjY=" ).
		body(payload.Createissue()).
		when().log().all().post("rest/api/3/issue").
		then().log().all().statusCode(201).extract().response().asString();
		System.err.println(Respose);
		
		JsonPath js=new JsonPath(Respose);
		String ID =js.getString("id");
		System.out.println(ID);

// Upload the screenshots in Jira
		
// https://lavanyapadmaprabhuraj.atlassian.net/rest/api/3/issue/10005/attachments
   //                                         "rest/api/3/issue/{key}/attachments"
		given()
        .pathParam("key",ID)
        .header("X-Atlassian-Token","no-check")
        .header("Authorization","Basic " + "bGF2YW55YXBhZG1hcHJhYmh1cmFqQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjAtTFRuTnhnVUFkdGpKZTROaGFHMzgyNmtZY0NxUFdiMFJPX0sweFVtNm9xV0ZoV3c2bEtuLUVLQ1FzVGZsb3VmWHE2SzdMOVRkRXhkNC1oOGVVR0U3R2JOY0dnamxqWm5DdllJZkdRR3U1OG9lR2tyNlNQMGdPSkR1dF94S1UxQ0YyTEpHbTRiQ2tsVmZNM18zRjhUSHVzbUZkQWprWnhHT3JuaDhkU0JLRFE9REVEOUExMjY")
        .multiPart("file",new File("C:\\Users/Lavanya/Pictures/Screenshots/file_example_MP3_700KB.mp3")).
         when().log().all().post("rest/api/3/issue/{key}/attachments")
        .then().log().all().assertThat().statusCode(200);     
		
// Get 
		
		given().log().all()
		.pathParam("key",ID)
	//	.header("Content-Type","application/json")
		.header("Authorization","Basic bGF2YW55YXBhZG1hcHJhYmh1cmFqQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjAtTFRuTnhnVUFkdGpKZTROaGFHMzgyNmtZY0NxUFdiMFJPX0sweFVtNm9xV0ZoV3c2bEtuLUVLQ1FzVGZsb3VmWHE2SzdMOVRkRXhkNC1oOGVVR0U3R2JOY0dnamxqWm5DdllJZkdRR3U1OG9lR2tyNlNQMGdPSkR1dF94S1UxQ0YyTEpHbTRiQ2tsVmZNM18zRjhUSHVzbUZkQWprWnhHT3JuaDhkU0JLRFE9REVEOUExMjY=" )
		.when().get("rest/api/3/issue/{key}")
		.then().log().all().assertThat().statusCode(200); 

	}

}
