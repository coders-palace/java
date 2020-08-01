package Java_programs;

class Person{
	String name;
	int age;
	
	public void get_values(String n,int a)
	{
		name=n;
		age=a;
	}
}

class Employee extends Person{
	String dept="Technical";
}
public class Programmer extends Employee{

	int salary=450000;
	
	public void display(){
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Department :"+dept);
	}
	public static void main(String[] args) {
		Programmer p=new Programmer();
		p.get_values("John", 25);
		p.display();

	}

}
