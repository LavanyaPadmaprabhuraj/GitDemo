import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateWord {

	public static void main(String[] args) {

		System.out.println("HASHSET METHOD---hashset: java collection: it stores unique values ");

		String names[]= {"c","c","python","java","lavs","lAvs","lavs","p","p"};	
	   // HashSet<String> hs= new HashSet<String>();
	    LinkedHashSet<String> hs=new LinkedHashSet<String>();
		 
		  for (String name:names) 
		  {
			  hs.add(name);

		    }
		  System.out.print( hs);
		  
	}		
		
	

	}


