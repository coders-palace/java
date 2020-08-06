package Java_programs;

interface Shape{
	void display();
}

interface Two_dim extends Shape{
	void type();
}

public class Circle implements Two_dim{

	public void display()
	{
		System.out.println("Inside display method ...");
	}
	
	public void type()
	{
		System.out.println("Type : Circle");
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		c.display();
		c.type();
		Shape s=new Circle();
		s.display();

	}

}
