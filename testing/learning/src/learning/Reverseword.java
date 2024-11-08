package learning;

import java.util.Scanner;

public class Reverseword {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the string");
        String s1=sc1.next();
        String rev="";
        char ch;
        for(int i=0;i<s1.length();i++)
        {
        	ch=s1.charAt(i);
        	rev=ch+rev;
        	rev=rev+ch;   // it won't revsere the word when we gave the rev + ch  " "lavs
        }
       System.out.println(rev);
        
	}

}
