package newlylearning;

import java.util.HashSet;
import java.util.LinkedHashSet;
//Note that the order of the words in the HashSet is not guaranteed to be the same as the 
//order in the original array. If you need to preserve the order,
//you can use a LinkedHashSet instead of a HashSet.
public class RemoveDuplicateWOrd {
	public static void main(String [] args)
		{
		  String[] ls={"lavs","bhus","Lavs","abhi","bhus","chandu","chandu"};
		 // HashSet<String>hs=new HashSet<String>();
		  LinkedHashSet<String>hs=new LinkedHashSet<String>();
		  for(String word:ls)
		  {
		      hs.add(word);
		  }
		  System.out.println(hs);  //[lavs, chandu, Lavs, bhus, abhi]
		}}

