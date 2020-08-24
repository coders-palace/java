package Java_programs;

class Table extends Thread
{
	int num;
	Thread t;
	Table(int n)
	{
		num=n;
	}
	public synchronized void printTable()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+num*i);
		}
		try{
			Thread.sleep(400);
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
	}
	public void run()
	{
		printTable();
	}
	public void start()
	{
		if(t==null)
		{
			t=new Thread(this,"Table");
			t.start();
		}
	}
}
public class SyncExample {

	public static void main(String[] args) {
		final Table obj=new Table(5);
		obj.start();
		final Table obj1=new Table(7);
		obj1.start();

	}

}
