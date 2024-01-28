package javabeginner;

public class Stack {
	int maxsize;int [] ar;int top=-1;
	Stack(int size)
	{
		maxsize=size;
	   ar=new int[maxsize];
	}
	private void push(int data)
	{
		if(isFull()) {
			System.out.println("Stack is overflow");} else
		{ar[++top]=data;System.out.println(data+"  is inserted");
		
	}}
	int pop()
	{
		if(isEmpty())
			System.out.println("Stack is empty");
		return ar[top--];
	}
	void peek()
	{   if(isEmpty()) {System.out.println("Stack is empty");} System.out.println();
		System.out.println( ar[top]);
	}
	boolean isFull()
	{
		return (top+1==maxsize);
	}
	boolean isEmpty()
	{
		return top==-1;
	}
	void disp()
	{
		for(int i=0;i<=top;i++)
			System.out.print(ar[i]+" ");
	}
	
 public static void main(String[] args)
 {
	 Stack s=new Stack(5);
	 s.push(3); s.push(2); s.push(1);s.pop();s.disp();s.peek();
 }
}
