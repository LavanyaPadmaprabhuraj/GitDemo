import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CountVowelsString {
   public static void main(String[] args) {
    String str="Lavanyabhuvan";
    int count =0;
    
    for(int i=0;i<str.length();i++)
    {
    	char c=str.charAt(i);
    	if(c =='a'|| c=='A' || c=='e'|| c=='E'|| c=='i'|| c=='I'|| c=='o' || c=='O'|| c=='u'|| c=='U')
    	{
    		count++;
    		
    	}
		
		
    }System.out.println("Number of vowels present :" +count  );
}
   
}