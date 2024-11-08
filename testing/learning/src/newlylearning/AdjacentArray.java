package newlylearning;


public class AdjacentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,4,54,7,15}; //3,1,2,8
		int diff=0;
		for(int i=0;i<a.length-1;i++)
		{
		    if(a[i+1] - a[i]>diff)
		    {
		     diff=a[i+1] - a[i];   
		    }
		 	
		}
    System.out.println(diff);
	}

}
