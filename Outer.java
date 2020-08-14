package Java_programs;

public class Outer {

	static class Inner_s{
		public void display()
		{
			System.out.println("Inside static class display method");
		}
	}
	
	private class Inner
	{
		public void display()
		{
			System.out.println("Inside inner class display method");
		}
	}
	public static void main(String[] args) {
		Outer.Inner_s o=new Outer.Inner_s();
		o.display();
		Outer out=new Outer();
		Outer.Inner inner=out.new Inner();
		inner.display();

	}

}
