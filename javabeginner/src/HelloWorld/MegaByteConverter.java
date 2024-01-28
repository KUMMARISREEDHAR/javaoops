package HelloWorld;

public class MegaByteConverter {
	
	 public static void main(String[]args)
	 {
		 printMegaBytesAndKiloBytes( -1024);
	 }
	 public static void printMegaBytesAndKiloBytes( int kiloBytes)
	    {   int mb,kb;
	        if(kiloBytes<0)
	        { System.out.println("Invalid Value");
	        return;}
	        else{
	         mb=kiloBytes/1024;
	         kb=kiloBytes%1024;
	        System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
	    }
	    }

}
