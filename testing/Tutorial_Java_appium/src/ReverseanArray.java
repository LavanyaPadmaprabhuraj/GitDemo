import java.util.Arrays;

public class ReverseanArray {

	public static void main(String[] args) {
		int a[]= {100,99,98,97,96,95,99};
		int temp,i=0,j=a.length-1;
		while(i<j)
		{
			temp=a[j];
			a[j]=a[i];
			a[i]=temp;
			i++;
			j--;
        }
		System.out.println(Arrays.toString(a));	
     }
}
