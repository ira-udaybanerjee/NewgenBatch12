package mt;

public class MTDemoMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int ctr=0; ctr<10; ctr++)
		{
		  MTDemo2 mt2 = new MTDemo2();
		  Thread th = new Thread(mt2);
		  th.start();
	    }
	}

}
