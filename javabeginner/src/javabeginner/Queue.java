package javabeginner;

public class Queue {
    int msize,rear,front; int ar[];
   Queue(int size)
   {   this.msize=size+1;
	   ar=new int [msize]; front=0;rear=-1;
   }
   void push(int data)
   {    if(rear==msize-1) System.out.println("Queue is Full");
   
       rear=(rear+1)%(msize);
	   ar[rear]=data;
   }
   int  pop()
   {
	   if(rear==-1)
		   {System.out.println("Queue is Empty");return 1;}
	   else
	   {  int temp=ar[front]; front=(front+1)%msize; return temp;}
	   
   }
   void disp()
   {
	   for(int j=front;j<=rear;j++)
		   System.out.print(ar[j]+" ");
   } 
   public static void main(String[] args)
   {
	   Queue q=new Queue(5);
	  q.push(5);q.push(4);q.push(3);q.pop();q.pop();q.disp();
   }
}
