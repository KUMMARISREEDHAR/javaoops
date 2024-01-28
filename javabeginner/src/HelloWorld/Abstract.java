package HelloWorld;

public abstract class Abstract {
	void main()
	{
		System.out.println("Iam First");
	}
	void method1()
	{
		System.out.println("Methodd 1");
	}
	
}
 class Iamhere extends Abstract
{
	void main1()
	{
		System.out.println("Method Implementation");
	}
	public static void main(String[]args) 
	{
		Iamhere im=new Iamhere();
		im.main1();
	}
}
