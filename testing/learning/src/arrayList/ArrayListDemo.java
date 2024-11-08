package arrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList myList= new ArrayList();
		List<Integer> mylist1=new ArrayList<Integer>();
		myList.add("Welcome");
		mylist1.add(2024);
		myList.add("Will enjoy");
		mylist1.add(null);
		mylist1.add(1200);
		myList.add("Bangalore");
		System.out.println("Before"           +   myList);
		System.out.println(mylist1);
		System.out.println("Size of array   :"  + myList.size());
		mylist1.remove(0);
		
		System.out.println("After removing" + myList);
		
		System.out.println("After removing" + mylist1.get(1));
		myList.clear();
		System.out.println(myList);
		 for (Object x:mylist1)
		 {
			 
		 }
		
	    Iterator lt=myList.iterator();
	    
	    while(lt.hasNext())        // hasnext method will check in arraylist value is present or not
	    	                        //hasnext() method will go to each and every value
	    {
		    System.out.println(lt.next());   //next() next method will get the one value and will go to while loop and check next value in the list

	    }
        
	   
	}

}
