package newlylearning;

class Occurrenceofword {
    public static void main(String[] args)
    {
        String word="abcjhjfhklhqdhhdlllll";
        char ch='l';
        int count=0;
        for (int i=0;i<word.length();i++)
        {
            if(word(i)==ch)
            {
                count++;
            }
        }System.out.println(" number of l is"+ count);
    }
    }
