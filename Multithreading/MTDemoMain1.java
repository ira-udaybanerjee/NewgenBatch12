package mt;

public class MTDemoMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++)
		{
			System.out.println("Main Thread");
		}
		
		for(int ctr=0; ctr<10; ctr++)
		{
		  MTDemo1 mt1 = new MTDemo1();
		  mt1.start();
	    }

 }
}