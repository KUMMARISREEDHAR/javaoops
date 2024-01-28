package HelloWorld;

public class TeenCheckerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(hasTeen(17, 5, 3)+"  "+isTeen(9));
	}
	public static boolean hasTeen(int a, int b, int c)
	{
		if( (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19) )
		return true;
		return false;
	}
	public static boolean isTeen(int one)
	{
		if(one>=13 && one<=19)
			return true;
		return false;
	}
}
