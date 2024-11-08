package learning;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the numbers");
		int numbers=sc.nextInt();
		int rev=0;
		while (numbers!=0)
		{
			rev=rev*10+numbers%10;
			numbers=numbers/10;
			
		}
		System.out.println(rev);
		
		}

}
