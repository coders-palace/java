package Java_programs;

public class Account {

	public static void main(String[] args) {
      Data d[]=new Data[5];
      d[0]=new Data();
      d[0].get_values(10, 5);
      d[1]=new Data();
      d[1].get_values(52, 30);
      System.out.println("For element 1");
      d[0].display();
      System.out.println("For element 2");
      d[1].display();
    		  

	}

}

class Data
{
	int a,b;
	
	public void get_values(int c,int d)
	{
		a=c;
		b=d;
	}
	
	public void display()
	{
		System.out.println("a :"+a);
		System.out.println("b :"+b);
	}
}
