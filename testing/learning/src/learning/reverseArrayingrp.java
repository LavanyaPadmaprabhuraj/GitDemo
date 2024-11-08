package learning;

import java.util.Arrays;

public class reverseArrayingrp {

	
		public static void reverse(int []arr,int k)
		{
			//0=i,1, 2, 3, 4, 5, 6, 7, 8
//int[] arr= {70,69,68,67,85,84,83,82,81};
		for (int i=0;i<arr.length-1;i++)
		{
			 int Start =i;
			 int End= Math.min(i+k-1,arr.length-1);
			 while (Start<=End)
			 {
				 int temp=arr[Start];
				 arr[Start]=arr[End];
				 arr[End]=temp;
				 Start++;
				 End--;
			 }
		 	 
		} }
		public static void main(String[] args) {
        //0=i,1, 2, 3, 4, 5, 6, 7, 8
		int[] arr= {70,69,68,67,85,84,83,82,81};  //from  0 to 4 will reverse 
		    // =o/p : 70 69 68 67 85 84 83 82 81 
		int k=4;
		reverse(arr, k);
		 for (int val:arr)
		 {
			System.out.print(val + " ");

	 }
		
	}

}
