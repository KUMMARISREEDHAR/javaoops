package javabeginner;

public class samplepro {
   public static int x=10;
   public class sam{
	   public static int x=1;
	 void name() {
	   System.out.println(x);
   }}
   void name() {
	   System.out.println(x);
	   sam sa=new sam();
	   sa.name();
   }
   
   public static void main(String[] args)
   {
	   samplepro sm=new samplepro(); sm.name();
	  
   }
	}

