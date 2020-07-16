package Java_programs;

import java.util.Arrays;

public class Records {
int rec1=100;
int rec2=rec1;

      public void display()
      {
    	  System.out.println(rec1);
    	  System.out.println(rec2);
      }
      
      int []ar1={10,20,30,40};
      int []ar2=ar1;
      
      public static void main(String args[])
    		  {
    	            Records r=new Records();
    	            r.display();
    	            r.rec1=50;
    	            r.display();
    	            System.out.println(Arrays.toString(r.ar1));
    	            r.ar1[0]=50;
    	            System.out.println(Arrays.toString(r.ar2));
    		  }
	
}
