package javabeginner;
public class arraylist {
	 int k;
	int ar[];
	arraylist() {  //default size
	ar=new int[3]; k=0;
	}
	 arraylist(int c)   //customized size
	{    k=c;
		 if(c<1) throw new IllegalArgumentException("array size must be >=1");
		 else
		ar=new int[k]; k=0;
	}
	public void get(int index)
	 {
		checkIndex(index);
		System.out.println(ar[index]);
	 }
	public void checkIndex(int index)
	{
	  if(index<0 || index> k)
	    throw new IndexOutOfBoundsException("index="+index+"size"+k);
	}
    public void indexOf(int e)
    {
    	for(int i=0;i<k;i++)
    	{
    		if(ar[i]==e)
    			
    		System.out.println(i);
    }}
    public void add(int e)
    {
    	if(k==ar.length)
    	{
    		int newar[]=new int[2*ar.length];
    	  System.arraycopy(ar, 0, newar, 0, k);
    		ar=newar;}
    		ar[k]=e;
    		k++;	
    }
    void sort()
    { 
    	bsort(ar);
    }
    void bsort(int [] br)
    {
    	br=ar;
    	for(int i=0;i<k;i++)
    	{ 
    		for(int j=i+1;j<k;j++)
    		{
    			if(ar[i]>ar[j])
    			{
    			int temp=ar[i];
    				ar[i]=ar[j];
    				ar[j]=temp;
    			}}
    		System.out.println(ar[i]);
    	}
    }
    void disp()
    {
    	System.out.print("[");
    	for(int i=0;i<k;i++) { System.out.print(ar[i]);  if(i!=k-1) {System.out.print(",");}}System.out.println("]");
    }
public static void main(String[]args)
{
	arraylist al=new arraylist(10);
	al.add(1);
	al.add(4);
	al.add(0);
	al.add(2);
	al.disp();
	al.sort();
}
}
