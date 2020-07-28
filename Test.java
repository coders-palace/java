package Java_programs;

public class Test {

	public static void main(String[] args) {
	    String s="Hello";
	    String s1=new String("hello");
	    String s2=new String("World");
	    
	    System.out.println(s.charAt(2));
	    System.out.println(s1.length());
	    System.out.println(s.equalsIgnoreCase(s1));
	    System.out.println(s1.equalsIgnoreCase(s2));
	    System.out.println(s.replace('l','L'));

	}

}
