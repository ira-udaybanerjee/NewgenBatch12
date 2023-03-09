package mt;

public class MTDemo2 implements Runnable {
	public void run()
	  {
		  for(int ctr = 0; ctr < 5; ctr++)
		  {
		   System.out.println("MT2 Thread");
		   try
		   {
			   Thread.sleep(500);
		   }
		   catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
		  }
		  
	  }
}
