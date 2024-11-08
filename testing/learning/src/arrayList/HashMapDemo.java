package arrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> mp=new HashMap<String,Integer>();
		HashMap<Integer,String> mp1=new HashMap<Integer,String> ();
		mp.put( "LP",101000000);
		mp.put( "BP",100);
		mp.put( "SP",111000000);
		mp.put( "BP",102);
		mp.put( "BP",100);
		System.out.println(mp);  //if we want to replace the value then add the value , then latest one it will replace
		
		System.out.println("********(key,Value)********");
		//      (key,Value)
		mp1.put(12,"AP");
		mp1.put( 13,"BP");
		mp1.put( 14,"CP");
		mp1.put(12,"VP");
		mp1.put(15,"BP");
		System.out.println("********ACCESS VALUE********  "+ mp1);
									//key   using key we can access the value 
	//	System.out.println(mp1.get("AP"));  // inside print we have to write and get the required value
		                                 // we can't acces key from value :: will get the null value
		mp1.remove(12);
		System.out.println("to get the value  = " +mp1.get(15));
		System.out.println("********ACCESSed VALUE after removed********  "+ mp1);
		System.out.println(mp1);
		
		//mp1.clear();
		
		//System.out.println(mp1); // once we cleared the valued we can't it take it back
		
		//get all the keys from Hashmap
		System.out.println(mp1.size());
    	System.out.println("Only keys can access  : " +mp1.keySet());  //13, 14, 15]
		System.out.println("Only values can access :" +mp1.values());  //[BP, CP, BP]
		System.out.println("both keys and values can access  : " +mp1.entrySet());  //[13=BP, 14=CP, 15=BP]
		
		//Reading data from hashMap
		
		
		// for each loop
		
//		for (String x:mp1.values())
//		{
//			System.out.println(x + "  "+mp1.get(x));
//		} 
		System.out.println("*****for each loop*****");
		for (int x:mp1.keySet())
		{
			System.out.println(x + "  "+mp1.get(x));
		} 
		
		System.out.println("*****Uisng Iterator*****");
		Iterator<Entry<Integer, String>> it =mp1.entrySet().iterator();
		while(it.hasNext())
		{
			//System.out.println(it.next());
			Entry<Integer, String>entry=it.next();
			System.out.println(entry.getKey()+ "  "+entry.getValue());
		}
		
		
		
		

	}

}
