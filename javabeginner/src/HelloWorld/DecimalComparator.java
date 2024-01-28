package HelloWorld;

public class DecimalComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(areEqualByThreeDecimalPlaces(3.176,3.175));
	}
	public static boolean areEqualByThreeDecimalPlaces(double one,double two)
	{
		double d=one*1000;double e=two*1000;int f,g;f=(int)d;g=(int)e;
		if(f==g)
			return true;
		return false;
	}

}
