package learning;

import java.util.Arrays;

public class SmallestandLargestarray {

	public static void main(String[] args) {
		int [] arr= {90,-109,99,10,0,1299218};
		int Largest= arr[0];
		int Smallest =arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>Largest)
			{
				Largest=arr[i];
		    }
			else if (arr[i]<Smallest) 
			{
				Smallest=arr[i];
			}
		}
		
		System.out.println(" numbers  : "+Arrays.toString(arr));
		
		System.out.println(" Largest numbers  : "+Largest);
		System.out.println(" Smallest numbers  : "+Smallest);





}
}