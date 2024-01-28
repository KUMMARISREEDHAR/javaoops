package HelloWorld;

public class CaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDayOfWeek(5); printWeekDay(4);
	}
	public static void printDayOfWeek(int num)
	{
		switch (num)
		{
		case 0:System.out.println("Sunday");break;
		case 1:System.out.println("Monnday");break;
		case 2:System.out.println("Tuesday");break;
		case 3:System.out.println("Wednesday");break;
		case 4:System.out.println("Thursday");break;
		case 5:System.out.println("Friday");break;
		case 6:System.out.println("Saturday");break;
		default:System.out.println("Number must be between 0 and 6 ");break;
		}
	}
	public static void printWeekDay(int n)
	{
		if(n==0)
			System.out.println("Sunday");
		else if(n==1)
			System.out.println("Monday");
		else if(n==2)
			System.out.println("Tuesday");
		else if(n==3)
			System.out.println("Wednesday");
		else if(n==4)
			System.out.println("Thursday");
		else if(n==5)
			System.out.println("Friday");
		else if(n==6)
			System.out.println("Saturday");
		else
			System.out.println("Number must  be between 0 and 6");
	}

}
