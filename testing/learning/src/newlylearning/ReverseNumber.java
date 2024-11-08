package newlylearning;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=12345,rev=0;
		System.out.println("Original number  "+num);
		while(num!=0)
		{
			  
			rev=num%10+rev*10; // we will get the reminder
			num=num/10;   // will get the quotient
			
		} System.out.println("After reverse "+rev);
       
	}

}
