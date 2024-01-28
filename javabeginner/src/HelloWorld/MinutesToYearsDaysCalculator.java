package HelloWorld;

public class MinutesToYearsDaysCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printYearsAndDays(561600);
	}
	public static void printYearsAndDays(long minutes)
	{   
		if(minutes<0)
			{System.out.println("Invalid Value"); return;}
		int hour=(int)(minutes/60); int day=(int)(hour/24); int year=(int)(day/365);
		if(day>365)
		{   int s=day%365;
		    if(s!=0)
			day-=365;
		    else
		    	day=day%365;}
		else if(day<365)
			day=hour/24;
			else 
				day=hour%24;
		System.out.println(minutes+" min = "+year+" y and "+day+" d");
		
	}

}
