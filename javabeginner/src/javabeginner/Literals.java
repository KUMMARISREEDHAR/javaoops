package javabeginner;

public class Literals {
	byte myByte=125;
	short myShort=2500;
	int myInt=28000;float f=(float)(5.25);double d=5.25;int pounds=200;float k=0.4535097f;
	char c=63,e='\u003F',g='?';
	long myLong=50000+10*(myByte+myShort+myInt);void disp() { double s=pounds*k;int ll=10;ll-=5;ll-=7;
		System.out.println(ll+" "+e+" "+g);
	}
	public static void main(String[]args) { Literals l=new Literals();
	l.disp(); 

}}
