package Java_programs;

import java.util.*;
public class ArrayListExp {

	public static void main(String[] args) {
		ArrayList <String> a1= new ArrayList<String> ();
		a1.add("123");
		a1.add("Hello");
		a1.add("100.5");
		
		Iterator itr=a1.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	}

}
