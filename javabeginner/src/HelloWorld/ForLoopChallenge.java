package HelloWorld;

public class ForLoopChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0,c=0;
     for(int i=1;i<=1000;i+=1)
     {
    	 if(i%3==0 && i%5==0)
    	 {
    		 System.out.println(i);
    		  k+=i;
    		  c++;
    		  if(c==5)
    			  break;
    	 }
     }
     System.out.println("Sum = "+k);
	}

}
