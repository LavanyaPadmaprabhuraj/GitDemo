package newlylearning;

public class ReverseString {

	public static void main(String[] args) {
		String a="lavs";
		char ch;
		String rev="";
		for(int i=0;i<a.length();i++)
		{
//			ch=a.charAt(i);
//			rev=ch+rev;
			rev=a.charAt(i)+rev;
		   
		}System.out.println(rev);
       }
}
