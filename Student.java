package Java_programs;

public class Student {
	String name;
	int age;
	double marks;
	
	public void show()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(marks);
	}
	
	Student(String n,int a,double m){
		name=n;
		age=a;
		marks=m;
	}
	
	Student(String n)
	{
		name=n;
	}
	public static void main(String args[])
	{
		Student s=new Student("Tom",10,89.4);
		Student s2=new Student("Roy");
		s.show();
		s2.show();
	}

}
