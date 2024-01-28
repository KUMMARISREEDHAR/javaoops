package HelloWorld;

public class Method1 {
	public void name(int num)
	{
		if(num>0)
			System.out.println("positive");
		else if(num<0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
	}
public static void main(String[]args)
{
	Method1 m1=new Method1();
	m1.name((int)1.2);
}
}
