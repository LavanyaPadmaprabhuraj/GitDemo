package newlylearning;

import java.util.HashSet;

public class CollectionRemoveDupli {

	public static void main(String[] args) {
		int a[]= {1,2,3,1,2,4,57,7,8,90,0};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
      System.out.println(hs);
	}

}
