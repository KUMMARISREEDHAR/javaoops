package javabeginner;
class node
{                                //creating linked list with user defined method
	int data;
	node next; node pre;
	node(int data){
		this.data=data;
		this.next=null;this.pre=null;
	}
}
public class linkedlist {
	public node head;
	public node tail; public node temp=null;
	void insertAtBegin(int data)
	{
		node n=new node(data);
		if(head==null) { 
			head=n; tail=n;}
		else {
		n.next=head;
		head=n;
	}}
	void insert(int data)
	{
		node n=new node(data);
		if(head==null)
			System.out.println("select insertAtBegin method");
		else
		{
			tail.next=n;
			tail=n;
		}
	}
	void insertAtEnd(int data)
	{
		node n=new node(data);
		if(tail==null) {
			head=n; tail=n;}
		else {
		tail.next=n;
		tail=n;
	}}
	void deletAtBegin()
	{   temp=head;
		head=temp.next;  temp.next=null;  // we can achieve this by head=head.next;
	}
	void deletAtEnd()
	{
		temp=head;
		while(temp.next!=tail)
	temp=temp.next;temp.next=null;tail=temp;
	}
	void disp()
	{
		temp=head;
		System.out.println(temp.data);
		while(temp.next!=null)
		{
			temp=temp.next;
			System.out.println(temp.data);
		}
	}
	public static void main(String[] args)
	{
		linkedlist ll=new linkedlist();
		ll.insertAtBegin(3);
		ll.insertAtEnd(5);
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.deletAtBegin();
		ll.deletAtEnd();
		ll.disp();
	}
}
