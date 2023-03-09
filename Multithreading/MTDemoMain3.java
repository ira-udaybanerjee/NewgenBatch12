package mt;

public class MTDemoMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   MTDemo2 mt2 = new MTDemo2();
	   Thread th2 = new Thread(mt2);
	   th2.start();
	   th2.setPriority(Thread.NORM_PRIORITY);
	   //mt3.setPriority(4);
	   //th2.setPriority(5);
	 
		
	   MTDemo3 mt3 = new MTDemo3();
	   mt3.start();
	   mt3.setPriority(Thread.MIN_PRIORITY);
	   
	   //mt3.setPriority(1);
	   
       Thread th = Thread.currentThread();     
       
       //th.setPriority(10);
       th.setPriority(Thread.MAX_PRIORITY);
       
       
       for (int i = 0; i < 5; i++) {
           System.out.println("Current thread");
           try
           {
             th.sleep(20);
             
           }
           catch(Exception ex)
           {
        	   ex.getStackTrace();
           }
       }
       
      
       
	}

}
