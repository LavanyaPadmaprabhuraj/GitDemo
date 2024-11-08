package javaProgramming;

public class SumofElements {
// we can't create method inside the main methods , we can create outside the main inside the class
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};  //21
		int sum=sumarray(a);
		System.out.println(sum);
		}
 public static int sumarray(int a[])
 {
	 int sum=0;
    for (int i=0;i<a.length;i++)
    {
    	sum=sum+a[i];
    }
	 return sum;
 }
}
