//import org.testng.Assert;

import Files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonparse {
	public static void main(String[] args) {
	
	JsonPath js=new JsonPath(payload.coursesprice());
	
    // Print No of courses returned by API
   int count =js.getInt("courses.size()");
   System.out.println("No of APi are :" +count);
   
   //Print Purchase Amount
   
   System.out.println("--------------Print Purchase Amount-----------------");
   
   int PurchaseAmount=js.getInt("dashboard.purchaseAmount");
   System.out.println("Total PurchaseAmount is "+ PurchaseAmount);
   
   //Print Title of the first course
   System.out.println("---------------Print Title of the first course---------------");
   
   String Coursetitle=js.get("courses[0].title");
   System.out.println("Coursetitle  is "+Coursetitle);
   
   String Coursetitle1=js.get("courses[2].title");
   System.out.println("Coursetitle  2nd is "+Coursetitle1);	
   
   //Print All course titles and their respective Prices
   System.out.println("------------Print All course titles and their respective Prices-----------");
   
   for (int i=0;i<count;i++)
   {
	   String AllCourse=js.getString("courses["+i+"].title");
	   System.out.println(AllCourse);
    	System.out.println(js.get("courses ["+i+"].price").toString());
   }
   
   System.out.println("---------------Print no of copies sold by RPA Course--------------------");
    //System.out.println(js.get("courses[2].copies").toString());   // we should search based on values not index
   
   for(int i=0;i<count;i++)
   {
	   String getTitle=js.get("courses["+i+"].title");
	   if( getTitle.equalsIgnoreCase("RPA"))
	   {
         int c0pies=js.get("courses["+i+"].copies");
         System.err.println(c0pies);
         break;
	   }
   }
  // created one more testcase "Sumvalidation" 
//   System.out.println("------------------Verify if Sum of all Course prices matches with Purchase Amount------------------");
//   int sum=0;
//   for (int i=0;i<count;i++)
//   {
//	   int price=js.get("courses["+i+"].price");
//	   int copies=js.get("courses["+i+"].copies");
//	//   System.out.println(price);
//	   int totalprice=price * copies;
//	   
//	   sum =sum+totalprice;
//	   System.out.println(sum);
//   }
//
//   Assert.assertEquals(sum, PurchaseAmount);
// 
//}
}}