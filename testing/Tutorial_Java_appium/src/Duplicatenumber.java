import java.util.HashSet;

public class Duplicatenumber {
	
	
	    public static void main(String[] args) {
	        
	        int N[]={10,2033,30,23,30,30,718,10,2033,10,10,10};
	        HashSet <Integer>h2=new HashSet();
	       // HashSet<Integer>duplicate=new HashSet();
	        
	        for (int number:N)
	        {
	          if(!h2.add(number)) 
	          {
	              h2.add(number);
	          }
	       
	        }System.out.print("Duplicate value is : " +h2);
	        
	        }
	}


