package HelloWorld;

public class MethodOverLoadingChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoadingChallenge moc=new MethodOverLoadingChallenge();
		System.out.println(moc.convertToCentimeters(5,8));
	}
	public double convertToCentimeters(int height)
	{
		double centimeters=height*2.54;
				return centimeters;
	}
	public double convertToCentimeters(int feet,int inches)
	{
		
		return convertToCentimeters(inches=feet*12+inches);
	}

}
