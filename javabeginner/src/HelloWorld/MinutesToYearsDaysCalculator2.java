package HelloWorld;

public class MinutesToYearsDaysCalculator2 {
   public static final int mhour=60;
   public static final int mDayHours=24;
   public static final int mMinutesDay=24*60;
   public static final int mYearDays=365;
   public static final int mMinutesYear=mhour*mDayHours*mYearDays;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printYearsAndDays(1051200);
	}
	public static void printYearsAndDays(long minutes)
	{
		if(minutes<0)
		{System.out.println("Invalid Value");
		return;}
		long year=minutes/mMinutesYear;
		long day=(minutes/mMinutesDay)%mYearDays;
		System.out.println(minutes+" min = "+year+" y and "+day+" d");
		
	}
	

}
