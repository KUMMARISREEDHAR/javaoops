package HelloWorld;

public class AreaCalculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(area(3.9)+"  "+area(-8,10));
	}
	 public static double area(double radius)
		{   if (radius<0)
			return -1.0;
			return 3.141592653589793*radius*radius;
		}
		public static double area(double x,double y)
		{
			if (x<0 || y<0)
				return -1.0;
			return x*y;
		}

}
