package newlylearning;

public class Fibanocci {

	public static void main(String[] args) {
		// 0,1,1 2 3 5 8 13 21 34 55
		int a=0,b=1;
		int sum=0,i=1;
		while(i<10)
		{
			sum=a+b;
			System.out.print(sum + " ");
			a=b;
			b=sum;
		    i++;
			
		}
			

	}

}
