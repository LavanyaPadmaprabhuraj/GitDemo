

	// Java code to implement the approach
import java.io.*;
import java.util.*;
class findmissingnumberArray {
public static void main(String[] args) 
{
	int arr[] = {1, 2, 3, 5, 6,4,9,8};
	int missingNumber = findMissingNumber(arr);
    System.out.println(missingNumber);
    }
		        
     public static int findMissingNumber(int arr[]) {
     int n = arr.length + 1;
     int sum = n * (n + 1) / 2;
     int arrSum = 0;
     for (int i = 0; i < arr.length; i++) {
    	 arrSum += arr[i];
     }
     return sum - arrSum;

	   
}
	}

