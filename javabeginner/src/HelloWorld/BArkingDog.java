package HelloWorld;

public class BArkingDog {
	public static void main(String[]rgs)
{
		System.out.println(shouldWakeUp(true,23));
}
	public static boolean shouldWakeUp(boolean barking,int hourOfDay)
	{
		if(hourOfDay >= 0 && hourOfDay <= 23)
		{   
			if(barking == true) 
			
				if(hourOfDay<8 || hourOfDay>22)
			return true;
			else					
				return false;
		}
		return false;
	}

}
