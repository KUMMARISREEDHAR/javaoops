package trials;

import java.util.Arrays;

public class ArrayTrials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[][] ar[]=new int[3][2][2];
   System.out.println(Arrays.toString(ar));System.out.println(ar.length);
   
   for(int[] [] e:ar)
   System.out.println(Arrays.toString(e));
   for(int i=0;i<ar.length;i++)
   {
	   var iArray=ar[i];
	   for(int j=0;j<iArray.length;j++)
	   {
		   System.out.print(ar[i][j]+" ");
	   }
	   System.out.println();
   }
   System.out.println(Arrays.deepToString(ar));
	}
	

}
