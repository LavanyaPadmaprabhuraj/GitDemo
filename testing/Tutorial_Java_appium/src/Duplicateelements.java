
import java.util.HashSet;

import java.util.Set;

public class Duplicateelements {

	public static void main(String[] args) {
// we can use linkedHashSet instead of HashSet for order
	System.out.println("HASHSET METHOD---hashset: java collection: it stores unique values ");

	String names[]= {"c","c","python","java","lavs","la","lavs","p","p"};	
    HashSet<String> hs= new HashSet<String>();
    //HashSet<String> Duplicate=new HashSet();
	 
	  for (String name:names) {
		  if(!hs.add(name))
		  {
			  //Duplicate.add(name);
			  hs.add(name);

	    }
	}	//System.out.print( Duplicate + " ");
	System.out.print( hs + " ");
	  
}		
	
}