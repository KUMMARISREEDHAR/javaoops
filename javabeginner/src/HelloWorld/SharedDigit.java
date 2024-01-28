package HelloWorld;

public class SharedDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static boolean hasSharedDigit(int num1,int num2)
	    {
	        if((num1>=10 && num1<=99) && (num2>=10 && num2<=99))
	        {   
	           if((num1%10)==(num2%10))
	          { return true; }
	           else
	           { int newnum=0;
	           while(num2!=0)
	           {
	                newnum=newnum*10+num2%10;
	                num2/=10;
	           }
	           return (num1%10)==(newnum%10);}
	        }
	        return false;
	    }
	 public static boolean hasSharedDigit2(int num1,int num2)
	    {
	        if((num1>=10 && num1<=99) && (num2>=10 && num2<=99))
	        {
	            int fnum1=num1/10;int lnum1=num1%10;
	            int fnum2=num2/10;int lnum2=num2%10;
	            if(fnum1==fnum2 || lnum1==lnum2 || fnum1==lnum2 || fnum2==lnum1)
	            return true;
	        }
	        return false;
	    }

}
