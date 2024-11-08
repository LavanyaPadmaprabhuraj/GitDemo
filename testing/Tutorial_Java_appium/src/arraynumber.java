import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;



public class arraynumber {

	public static void main(String[] args) {
		
		//Aprroach -> using SORT function
		int a[] = {12,30,78,65,60,11};
		System.out.println("Printing the array elements before sorting" +Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Printing the array elements after sorting" +Arrays.toString(a));	
		
		//Aprroach 2  ->using parallelSort function
		
		int b[]= {10,00,00,89,90,100,9};
		System.out.println("****Printing the array elements before sorting****" +Arrays.toString(b));
		Arrays.parallelSort(b);
		System.out.println("****Printing the array elements after sorting****" +Arrays.toString(b));
	
		// Descending order
		
		Integer c[]= {101,020,040,89,990,100,9};
		System.out.println("**&&&&**Printing the array elements before sorting**&&&&**" +Arrays.toString(c));
		//Arrays.sort(c,Collection.reverseOrder());

		
		
		
		
		
		

	}

}
