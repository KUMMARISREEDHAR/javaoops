package javabeginner;
   
public class LinkedlistTree extends Doublell {
	node root;
	  void insert(int data)
	  {
		  node n=new node(data);
		  if(root==null)
		    root=n;
		  else
		  {
			  if(root.data<data)
				  {root.pre=n;n=root;}
			  if(root.data>data)
			  { root.next=n;n=root;}
		  }
	  }
	  void disp()
	  {
		  temp=root;
		  System.out.println(temp.data);
		  do
		  {
			  temp=temp.next;temp=temp.pre;System.out.print(temp.data);
		  }
		  while(temp.pre==null&&temp.next==null);
	  }
	  public static void main(String[]args) {
	  LinkedlistTree lt=new LinkedlistTree();
	  lt.insert(10);lt.insert(15);lt.insert(5);lt.insert(10);lt.disp();
	  
}}
