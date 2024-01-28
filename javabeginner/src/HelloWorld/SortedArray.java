package HelloWorld;
import java.util.Arrays;
import java.util.Scanner;
public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SortedArray sa=new SortedArray();
    int ar[]=sa.getIntegers(5);
    System.out.println(Arrays.toString(ar));
    reverse(ar);
	}
	
	public  int[] getIntegers(int n)
	{
		if(n<0)
		System.out.println("invalid Size"); 
		int array[]=new int[n];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+i+" element");
			array[i]=s.nextInt();		
			}
		return array;
		
	}
	public int[] sortArray(int ar[])
	{   int temp=0;
		boolean flag=true;
		while(flag)
		{
			flag=false;
			for(int i=0;i<ar.length-1;i++)
			{
				if(ar[i]<ar[i+1])
				{
					temp=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=temp;
				flag=true;
				}
			}
		}
		return ar;
	}
	public void printArray(int [] sortarray)
	{
		for(int i=0;i<sortarray.length;i++)
			System.out.println("Element "+i+" contents "+sortarray[i]);
	}
	public static void reverseArray(int ar[])
	{
		int maxIndex=ar.length-1;
		int halfIndex=ar.length/2;
		for(int i=0;i<halfIndex;i++)
		{
			int temp=ar[i];
			ar[i]=ar[maxIndex-i];
			ar[maxIndex-i]=temp;
		}
		System.out.println("-->"+Arrays.toString(ar));
	}
	public static void reverse(int ar[])
	{   System.out.println("Array = "+Arrays.toString(ar));
		int ar2[]=new int[ar.length];
		int maxIndex=ar.length-1;
		for(int ele:ar)
			ar2[maxIndex--]=ele;
		System.out.println("-->"+Arrays.toString(ar2));
	}

}
