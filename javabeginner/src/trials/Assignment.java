package trials;

 class Subclass 
{  static int k=0;
  static void m3()
{ System.out.println("iam Method 3 in Subclass");
}

}

public class Assignment extends Subclass {
      int a=10;
      void m1()
      {
   	 System.out.println("iam method 1 Assignment class");  
      }
      static void m2()
      {
   	  System.out.println("iam static method in final class"); 
      }   
 public static void main(String[] args)
{
 Assignment sb=new Assignment();
 sb.m1(); m2(); m3();
}

}
