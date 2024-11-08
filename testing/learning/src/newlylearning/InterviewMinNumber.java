package newlylearning;

public class InterviewMinNumber {

	public static void main(String[] args) {
     int abc[][]= {{3,2,11},{5,6,8},{109,2,12}};
     int min=abc[0][0];  //3 is small
     for (int i=0;i<3;i++)
     {
    	 for(int j=0;j<3;j++)
    	 {
    		 if(abc[i][j]<min)
    			 min=abc[i][j];
    	 }
     }
     System.out.println(min);
	}

}
