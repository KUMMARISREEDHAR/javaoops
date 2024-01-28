package trials;
class Grandfather
{
	Grandfather()
	{
		System.out.println("iam constructor of Grandfather class");
	}
	
	void m1()
	{
		System.out.println("iam m1 method in Grandfather class");
	}
	static void method()
	{
		final double k=3.142;
		System.out.println(k+" iam Grandfather class variable");
	}
	
	final double k=(22/7);
}
	class father extends Grandfather
	{
		father(){ 
			System.out.println("iam father class");
		}
		double r;
		 void area(double r)
		{
			System.out.println("Area of Circle"+(k*r*r));
		}
		 static void method()
			{
				System.out.println("iam static method in father class");
			}
	}
public class SuperKeyWord extends father {
	static int k=10;
	public static void main(String[] args)
	{
		SuperKeyWord s=new SuperKeyWord(5,2.5);
		s.area(5); method();System.out.println(k);
	} 
	SuperKeyWord()
	{
		
		System.out.println("this is after super constructor method");
		
	}
	SuperKeyWord(int k,double l)
	{ 
		this();
		this.k=22;
		 System.out.println("this is constructor with arguements and this() demonstration");
	    System.out.println("after 1st statement "+l);System.out.println(k);
	}
	
	
	
	void area(double r)//area method in father class is override here
	{
		System.out.println("Area of circle  == "+(r*r));
	}
	void m4()
	{
		System.out.println("method in class");
	}
	
}
