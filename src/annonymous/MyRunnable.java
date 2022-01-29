package annonymous;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		for(int i=0; i<5; i++) {
			System.out.println("inside runnable");
			try {
			Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
