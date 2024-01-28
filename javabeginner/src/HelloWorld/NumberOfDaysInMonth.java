package HelloWorld;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLeapYear(2000)+"  "+getDaysInMonth(2,2000));
	}
	public static boolean isLeapYear(int year)
	{
		if(year<1 || year>9999)
			return false;
		switch (year%4)
		{
		case 0 -> {if(year%100!=0) return true; else {if(year%400==0) return true;} return false;}
		default -> {if(year%100==0) {if(year%400==0) return true;}else return false; 
		}
	} return false;

	}
	public static int getDaysInMonth(int month,int year)
	{
		if(month<1 || month>12 || year<1 || year>9999)
			return -1;
		if(isLeapYear(year)==true)
		{
		switch (month)
		{
		case 1,3,5,7,8,10,12 -> {return 31;}
		case 2 ->  {return 29;}
		default -> {return 30;}
		
	}
	}      if(isLeapYear(year)==false)
			switch (month)
			{
			case 1,3,5,7,8,10,12 -> {return 31;}
			case 2 ->  {return 28;}
			default -> {return 30;}}
	return -1;
	}}
	
