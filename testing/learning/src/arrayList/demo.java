package arrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
//		int s1[]= {10,90,35,677,778,77};
//		int Temp=0;
//		for(int i=0;i<s1.length-1;i++)
//		{
//			for(int j=i+1;j<s1.length-1;j++)
//			{
//				if(s1[i]<s1[j])
//				{
//					Temp=s1[i];
//					s1[i]=s1[j];
//					s1[j]=Temp;
//				}
//				
//			}
//			System.out.print((s1[i] + " "));
//		}
//		

		
//		 int []N={10,23,4,44,5,5,85,6};
//		 int i=0,j=N.length-1;
//		 while(i<j)
//		 {
//			 int Temp=N[i];
//			 N[i]=N[j];
//			 N[j]=Temp;
//			 i++;j--;
//					 
//		 }
//		 
//		 System.out.print((Arrays.toString(N)));
		
		String s1[]= {"Lavs","Lp","Bhu","Lavs"};
		HashSet<String>hs=new HashSet<String>();
		for(String h1 :s1)
		{
		    if(hs.add(h1)==false)

			{
		    	System.out.print(((hs + " ")));

			}
		}
		
	}
	
	}
