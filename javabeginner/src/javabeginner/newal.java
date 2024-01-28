package javabeginner;

public class newal {
    int [] ar;
    int size; static final int defaultcapacity=3;
    newal()
    {
    	ar=new int[defaultcapacity];
    	size=0;
    }
   void add(int e)
    {
    	if(size==ar.length)
    	{
    		ic();
    	}
    	ar[size]=e; size++;
    }
   void remove(int index)
   {
	   if(index<0||index>size) {throw new ArrayIndexOutOfBoundsException("ArraysIndexOutOfboundsException");}
	   for(int i=index;i<size-1;i++)
		   ar[i]=ar[i+1]; size--;
   }
   void ic()
   {
	   int nc=ar.length*2;
	   int [] newar=new int[nc];
	   System.arraycopy(ar, 0, newar, 0,size);
	   ar=newar;
   }
   void print()
   {
	   System.out.print("[");
	   for(int i=0;i<size;i++)
	   {
		   System.out.print(ar[i]);
		   if(i!=size-1)
			   System.out.print(",");
	   } System.out.println("]");
   }
   void get(int index)
   {
	   if(index<0||index>size) {System.out.println("invalid index");}
	  System.out.println(ar[index]); 
   }
   void indexOf(int e)
   {
	   for(int i=size-1;i>=0;i--) {if(ar[i]==e) {System.out.println(i);}}
   }
   void sort()
   { 
   	bsort(ar);
   }
   void bsort(int [] br)
   {
   	br=ar;
   	for(int i=0;i<size;i++)
   	{ 
   		for(int j=i+1;j<size;j++)
   		{
   			if(ar[i]>ar[j])
   			{
   			int temp=ar[i];
   				ar[i]=ar[j];
   				ar[j]=temp;
   			}}
   		System.out.println(ar[i]);
   	}}
   public static void main(String[]args)
   {
	   newal al=new newal();
	   al.add(5);
	   al.add(4);
	   al.add(3);
	   al.add(2);
	   al.print();
	   al.sort();
	   
   }
}
