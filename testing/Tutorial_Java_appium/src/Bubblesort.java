import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		int a[]= {20,40,10,02,9};
		int temp=0;
	 System.out.println("Ascending order");
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			System.out.print(a[i] + " ");  //2 9 10 20 40 
			
		}
		 System.out.println("Descending order");
	     int Number[]={21,2,34,55,67,89,9};
	        int Temp=0;
	        System.out.println(Number.length);
	        for(int i=0;i<Number.length;i++)
	        {
	            for(int j=i+1;j<Number.length;j++)
	            {
	                if(Number[i]<Number[j])
	                {
	                    Temp=Number[i];
	                    Number[i]=Number[j];
	                    Number[j]=Temp;
	                }
	               
	            }
	             System.out.print(Number[i] + " ");
	        }
		
	}}
