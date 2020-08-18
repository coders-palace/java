package Java_programs;

class Multi extends Thread
{
	Thread t;
	String name;
	Multi(String nm)
	{
		this.name=nm;
		System.out.println("New thread created");
	}
	public void run()
	{
		System.out.println("Running thread :"+name);
	}
	
	public void start()
	{
		System.out.println("Starting thread :"+name);
		if(t==null)
		{
			t=new Thread(this,name);
			t.start();
		}
	}
}
public class MultiThread {

	public static void main(String[] args) {
		Multi m=new Multi("One");
		m.start();

	}

}
