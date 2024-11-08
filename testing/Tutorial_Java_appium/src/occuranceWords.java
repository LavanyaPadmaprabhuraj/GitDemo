import java.util.HashMap;

import org.checkerframework.checker.units.qual.h;

public class occuranceWords {

	public static void main(String[] args) {
		String s1= "Alice is girl and Bob is boy";
		String []s2=s1.split(" ");

        HashMap<String,Integer>hashmap=new HashMap();
		for(String S: s2)
		{
			Integer integer=hashmap.get(S);
			if(integer==null)
			{
				hashmap.put(S, 1);
			}else
			{
				hashmap.put(S, integer+1);
			}
		}
		System.out.println(hashmap);
	}

}
