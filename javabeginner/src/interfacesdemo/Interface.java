package interfacesdemo;
interface Demo
{
	int a=1,b=2;
   void m1();
}
 class BeforeInterface implements Demo {
	 
	 int k; double d;char c;String s;boolean b;
  public void  m1()
    {
    System.out.println("iam now in this class"+k+"  ="+d+"     ="+s+"  ="+b+"  \niam c="+c);
    }
	static void m2()
	{
		System.out.println("this is m2 method");
	}
}
 public class Interface 
 {   
	 
	 
	 public static void main(String[] args)
		{
			BeforeInterface i=new BeforeInterface();
			i.m1();
		}
 }
