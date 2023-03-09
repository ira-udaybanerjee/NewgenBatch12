package mt;

class MTDemo1 extends Thread
{
  public void run()
  {
	  for(int ctr = 0; ctr < 5; ctr++)
	  System.out.println("Thread " + Thread.currentThread().getName() + " is running");
  }
}

