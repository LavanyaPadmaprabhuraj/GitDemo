package arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {
		Set myList=new HashSet<>();
		myList.add("Welcome");
		myList.add(2024);
		myList.add("Will enjoy");
		myList.add(null);
		myList.add(1200);
		myList.add(1200);
		myList.add(null);
		myList.add("Bangalore");
		System.out.println("After adding the data into hashset :" +   myList);
		System.out.println(myList.size());
        myList.remove("Welcome");  // only with Value we can remove.Not from Index
		System.out.println("After removing index0 data from hashset :" +   myList);
		
		//Inserting elements  ->Not Possible -> becuase index is not preserved
		//Access the specific elements ->Not Possible -> becuase index is not preserved
		
		ArrayList MYlist=new ArrayList(myList);   //Hashset converted into ArrayList 
		System.out.println("Hashset converted into ArrayList:  "+MYlist);
		
		MYlist.add(2,"Tomorrow Election in KA 68");
		System.out.println("Hashset converted into ArrayList and inserted element  :  "+MYlist);
		
		System.out.println("Acess specific element" + MYlist.get(1));
		System.out.print(MYlist);
		
	//Normal for loop not possiable ->index NA
		for (Object x:MYlist)
		{
			System.out.println(x);
			
		}
		System.out.println("&**************************&");

		
	    Iterator lt=MYlist.iterator();
	     while(lt.hasNext())
	     {
	    	 System.out.println(lt.next());
	     }
		 MYlist.clear();
		 System.out.print(MYlist);

	
    
	}

}
