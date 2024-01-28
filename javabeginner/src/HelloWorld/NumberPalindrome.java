package HelloWorld;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(isPalindrome(120));
	}
	public static boolean isPalindrome(int number)
	{  int reverse=0; int original=number;
		while(original!=0)
		{   
			reverse=reverse*10+original%10;
			original/=10;
		}
		return reverse==number ;
	}

}
