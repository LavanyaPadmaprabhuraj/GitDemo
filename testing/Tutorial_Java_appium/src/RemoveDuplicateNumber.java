import java.util.HashSet;

public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		int num[]= {1,2,4,5,1,2,3,4,5};
		HashSet hs=new HashSet();
		
		for(int N:num)
		{
			hs.add(N);
		}System.out.println(hs);
		

	}

}
