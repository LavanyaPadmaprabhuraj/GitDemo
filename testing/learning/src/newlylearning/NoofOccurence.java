package newlylearning;

public class NoofOccurence {

	public static void main(String[] args) {
		int count=Occurence("abcadaaaaaaaaaaaaaaaaaaa1hihd",'1');
		System.out.println("number of occurence : "+count);
			}

	private static int Occurence(String word, char c) {
		int count =0;
		for (int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==c)
			{
				count++;
			}
		}return count;
		
	}

}
