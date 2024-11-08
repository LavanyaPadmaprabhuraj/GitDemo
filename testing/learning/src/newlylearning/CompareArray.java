package newlylearning;

import java.util.ArrayList;

public class CompareArray {
//compare same indexes of 2 different arrays and create another array for matching values
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,2,3,1,8};
		ArrayList<Integer> al=new ArrayList<Integer>();
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==b[i])
			{
				al.add(a[i]);
			}
	    }
		System.out.println("ArrayList "+al);  // ArrayList [2, 3]
		Object[] c=al.toArray(); // converting ArrayList to array
		
		for (Object arr:c)
		{
		    System.out.println("Array "+arr);  //Array 2
		                                       //Array 3
		}

}}
