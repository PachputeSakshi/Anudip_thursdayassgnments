package thursday_assignments;

public class displaymessage extends Thread
{
	private String message;
	
	public displaymessage(String message) 
	{
		this.message=message;
	}
	
	public void run() 
	{
		try 
		{
			while(true) 
			{
				System.out.println(message);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e) 
		{
			//exits
		}
	}
}
