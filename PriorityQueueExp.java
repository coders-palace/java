package Java_programs;

import java.util.*;
public class PriorityQueueExp {

	public static void main(String[] args) {
		Queue<String> q1=new PriorityQueue<String> ();
		q1.add("Tina");
		q1.add("Apple");
		q1.add("Hello");
		
		for(String str:q1)
		{
			System.out.println(str);
		}

	}

}
