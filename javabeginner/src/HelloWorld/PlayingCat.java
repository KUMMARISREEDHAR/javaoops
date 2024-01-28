package HelloWorld;

public class PlayingCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isCatPlaying(false,45));
	}
	public static boolean isCatPlaying(boolean summer,int temparature)
	{
		if(summer==true)
		{
			if(temparature>=25 && temparature<=45)
				return true;
			else
				return false;
		}
		else
			if(temparature>=25 && temparature<=35)
				return true;
			else
				return false;
			
	}

}
