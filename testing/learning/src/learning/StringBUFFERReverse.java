package learning;

import java.util.Scanner;

public class StringBUFFERReverse {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the string");
		String value = s1.nextLine();
		
		StringBuffer sb=new StringBuffer(value);
		StringBuffer rev=sb.reverse();
		System.out.println(rev);

	}

}
