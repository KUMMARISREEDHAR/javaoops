package HelloWorld;

public class FirstLastDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(sumFirstAndLastDigit(123
		  )+"   "+  sumFirstAndLast(123));
	}
	public static int sumFirstAndLastDigit(int number)
	{
		if(number>=0)
		{    int first=number%10;
			 int reverse=0; int original=number;
			 while(original!=0)
				{   
					reverse=reverse*10+original%10;
					original/=10;
				}
				 int second=reverse%10;
				 return (first+second);
		}
		return -1;
	}
	public static int sumFirstAndLast(int number)
	{
		if(number>=0)
		{    int last=number%10;
			 while(number>=10)
				{   
					number/=10;
				}
				int first=number;
				 return (first+last);
		}
		return -1;
	}
}
