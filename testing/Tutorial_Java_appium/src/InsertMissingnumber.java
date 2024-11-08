import java.util.Arrays;
public class InsertMissingnumber {
	
	    public static void main(String[] args) {
	        int arr[] = {1, 2, 3, 5, 6};
	        int missingNumber = findMissingNumber(arr);
	        arr = insertMissingNumber(arr, missingNumber);
	        System.out.println("Array after inserting the missing number: " + Arrays.toString(arr));
	    }

	    public static int findMissingNumber(int arr[]) {
	        int n = arr.length + 1; //6
	        int sum = n * (n + 1) / 2; // 21
	        int arrSum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            arrSum += arr[i];
	        }
	        return sum - arrSum;   //21-17=4
	    }

	    public static int[] insertMissingNumber(int arr[], int missingNumber) {
	        int i;
	        for (i = 0; i < arr.length; i++) {
	            if (arr[i] > missingNumber) {
	                break;
	            }
	        }
	        int newArr[] = new int[arr.length + 1];
	        System.arraycopy(arr, 0, newArr, 0, arr.length);
	        newArr[i] = missingNumber;
	        System.arraycopy(arr, i, newArr, i + 1, arr.length - i);
	        return newArr;
	    }
	}

