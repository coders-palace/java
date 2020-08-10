package Java_programs;

class Fruits{
	void color()
	{
		System.out.println("Inside color method");
	}
}

class Apple extends Fruits{
	public void color()
	{
		System.out.println("An apple of red color");
	}
}

class Mango extends Fruits{
	public void color()
	{
		System.out.println("A mango of yellow color");
	}
}
public class Example {

	public static void main(String[] args) {
		Fruits a,m;
		a=new Apple();
		m=new Mango();
		a.color();
		m.color();

	}

}
