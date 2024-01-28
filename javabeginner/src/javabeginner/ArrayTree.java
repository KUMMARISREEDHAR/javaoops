package javabeginner;
public class ArrayTree {
	int ar[];int cap,ci,npi,pi;
	ArrayTree(int s)
	{   cap=s;
		ar=new int[cap];ci=0;
	}
	
	void insert(int data)
	{   
		if(ci==0) {
			ar[ci]=data;}
		else { int pi=(ci-1)/2;
			if(ar[pi]<data)
			{npi=2*pi+2;ar[npi]=data;}
			if(ar[pi]>data)
			{npi=2*pi+1;ar[npi]=data;}
		}ci++;}
	
	void disp()
	{
		for(int i=0;i<ci;i++)
			System.out.print(ar[i]+" ");System.out.println();
	}
	public static void main(String[]args) {
 ArrayTree at=new ArrayTree(10);
at.insert(10);at.insert(2);at.insert(11);at.insert(1);at.insert(4);
at.insert(5);at.insert(13);at.disp();
}}
