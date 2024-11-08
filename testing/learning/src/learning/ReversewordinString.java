package learning;

import java.util.Scanner;

public class ReversewordinString {

	public static void main(String[] args) {
//		Scanner sb=new Scanner(System.in);
//		 System.out.println("Enter the string");
//        String s1=sb.next();
//   	    System.out.println(s1);
		String s1= "I am in bangalor@@e";
        String a[]=s1.split(" ");
        String str1="";
//        for(int i=0;i<a.length;i++)
//        {
//       	 System.out.print(a[i] + " ");
//        }
//        System.out.println("");
        for(int i=a.length-1;i>=0;i--)
        {
       	 str1=str1+a[i] + " ";
        }//System.out.print(str1);
	}

}
