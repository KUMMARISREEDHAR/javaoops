package trials;
abstract class StaticMethod {
	 public static void main()
	 {
		 System.out.println("this abstract class");
	 }
	 abstract void m1();
	static void m2()
	{
		System.out.println("iam a static method");
	}
	final void m3()
	{
		System.out.println("iam final method");
	}
}
public class Sample extends StaticMethod {

	void m1()
	{
		System.out.println("iam abstract method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10; System.out.println(x); 
	
		Sample s=new Sample(); s.m1();m2();s.m3(); main();
 }
}
