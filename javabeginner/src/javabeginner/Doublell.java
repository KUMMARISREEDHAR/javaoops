package javabeginner;

public class Doublell  {
	public node temp,head,tail;
     void insertAtBegin(int data)
     {
    	 node n=new node(data);
    	 if(head==null)
    		 head=n;
    	 else
    	 { head.pre=n;n.next=head;n.pre=null;head=n;}
     }
     void insertAtEnd(int data)
     {    node n=new node(data);
    	 if(tail==null)
    	 {head=n;tail=n;}
    	 else
    	 { 
    	tail.next=n;n.pre=tail;n.next=null;tail=n;
     }}
     void disp()
     {  temp=head;System.out.print(temp.data+" ");
     while(temp.next!=null)
     {
    	 temp=temp.next; System.out.print(temp.data+" ");
     }
    	 
     }
     public static void main(String[]args)
     {
    	 Doublell d=new Doublell();
    	d.insertAtEnd(5); d.insertAtBegin(2);d.insertAtBegin(3);d.insertAtBegin(4);d.insertAtEnd(6);d.disp();
     }
}
