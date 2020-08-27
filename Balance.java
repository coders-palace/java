package Java_programs;

class Transaction
{
	int amount=1000;
	
	synchronized void withdraw(int amount)
	{
		if(this.amount<amount)
		{
			System.out.println("Less balance !!! waiting for deposit ...");
			try{
				wait();
			}
			catch(Exception e)
			{
				
			}
		}
		this.amount=this.amount-amount;
		System.out.println("Withdrawl completed ...");
	}
	
	synchronized void deposit(int amount)
	{
		this.amount=this.amount+amount;
		System.out.println("Deposit completed ...");
		notify();
	}
}
public class Balance {

	public static void main(String[] args) {
		final Transaction t=new Transaction();
        new Thread()
        {
        	public void run()
        	{
        		t.withdraw(1500);
        	}
        }.start();
        
        new Thread()
        {
        	public void run()
        	{
        		t.deposit(2000);
        	}
        }.start();
	}

}
