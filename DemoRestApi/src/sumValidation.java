import org.testng.Assert;
import org.testng.annotations.Test;

import Files.payload;
import io.restassured.path.json.JsonPath;

public class sumValidation {

	@Test
	public void sumofCopies()
	{
		JsonPath js=new JsonPath(payload.coursesprice());
		
		  System.out.println("------------------Verify if Sum of all Course prices matches with Purchase Amount------------------");
		  int purchasemount= js.getInt("dashboard.purchaseAmount");
		  System.out.println("Total purchasemount  : " + purchasemount);
		  int count =js.getInt("courses.size()");
		  int sum=0;
		  for (int i=0;i<count;i++)
		  {
			  int Price=js.getInt("courses["+i+"].price");
			  int Copies=js.getInt("courses["+i+"].copies");
			  int total= Price * Copies;
			  sum=sum+total;
			  }
		  Assert.assertEquals(sum, purchasemount);
		
	}
}
