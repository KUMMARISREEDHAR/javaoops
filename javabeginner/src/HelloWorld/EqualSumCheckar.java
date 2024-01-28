package HelloWorld;

public class EqualSumCheckar {
     public static void main(String[]args)
     {
    	 System.out.println(hasEqualSum(1,-1,0));
     }
     public static boolean hasEqualSum(int a,int b,int c)
     {
    	 int k=a+b;
    	 if(k==c)
    		 return true;
    	 return false;
     }
}
