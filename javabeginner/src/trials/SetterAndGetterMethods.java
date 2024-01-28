package trials;

class Private
{
	private int num,age; private String name;
	public int getNum()
	{
		return num;
	}
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	void disp()
	{
		System.out.println("Number\n"+num+"\nAge\n"+age+"\nName"+name);
	}
	
}
public class SetterAndGetterMethods {
	public static void main(String[] args)
	{
		Private p=new Private();
		p.disp(); p.setAge(18);p.setName("Sree");p.setNum(2);
		p.getAge();p.getName();p.getNum();
		p.disp();
	}

}
