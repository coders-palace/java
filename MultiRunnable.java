package Java_programs;

class Multi1 implements Runnable
{
	public void run()
	{
		System.out.println("Running thread ...");
	}
}
public class MultiRunnable {

	public static void main(String[] args) {
		Thread t=new Thread(new Multi1());
		t.start();

	}

}
