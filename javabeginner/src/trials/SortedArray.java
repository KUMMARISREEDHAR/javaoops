package trials;
import java.util.*;
public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int []ar=	getArray(5);
   
  }
	public static int[] getArray(int len)
	{
		Random r=new Random();
		int [] randomArray=new int[len];
		for(int i=0;i<len;i++)
		{
			randomArray[i]=r.nextInt(100);
		}
		return randomArray;
	}
	
	
}
