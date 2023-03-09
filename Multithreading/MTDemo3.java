package mt;

public class MTDemo3 extends Thread{
	public void run()
	{
	  for (int i = 0; i < 5; i++) {
		 
        // Print statement whenever child thread is
        // called
        System.out.println("MT3 Thread");
        try
        {
        	//Thread.sleep(1000);
        	this.sleep(500);
        	
        }
        catch(Exception ex)
        {
        	ex.getStackTrace();
        }
      }
	}
}
