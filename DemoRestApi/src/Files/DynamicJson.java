package Files;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.*;

public class DynamicJson {
	@Test(dataProvider = "Book")
	public static  String addbook(String isbn,String aisle)
	{
		RestAssured.baseURI="http://216.10.245.166";
		String BookResponse=given().log().all().header("Content-Type" ,"application/json")
		//.body(payload.Addbook()).
	    .body(payload.Addbook(isbn,aisle))  // for multiple entry
		.when().post("Library/Addbook.php").
		then().log().all().statusCode(200).extract().response().asString();	//asString ->get the response body as string
              		                                                           //o/p:  {"Msg":"Book Already Exists","ID":"LPB121"}
		System.out.println(BookResponse);
        JsonPath js=Reusablemethods.rawToJson(BookResponse);
        String id=js.get("ID");
        String ResponseMsg=js.getString("Msg");
        System.out.println("Response ID is- " +id+ "  response Msg is : "+ResponseMsg);
        return id;
        
     }
	@Test(dataProvider="Book")
	public void DeleteBook(String isbn,String aisle)
	{
		RestAssured.baseURI="http://216.10.245.166";
		given().log().all().header("Content-Type","application/json").body(payload.DeleteBook(isbn)).
		when().delete("Library/DeleteBook.php").
		then().log().all().assertThat().statusCode(200).and().body("msg",equalTo("book is successfully deleted"));
	}
	
	//arrays is collection of elements
	//multi dimension array
	@DataProvider(name="Book")
	public Object[][] getData()
	{
		return new Object[][] {{"LPB","1432"}, {"BPL","1153"},{"SBJ","1980"}};
		
	}
	


}
