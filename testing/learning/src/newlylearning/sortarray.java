package newlylearning;

public class sortarray {
	public static void main(String []args)
	{
		int a[]= {1,2,23,4,78,90,8888,10,101};
		System.err.println(a);
		
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			System.out.println(a[i] + " ");
		
		}
	}

}
