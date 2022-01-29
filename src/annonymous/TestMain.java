package annonymous;

public class TestMain {

	public static void main(String[] args) throws InterruptedException {
		
//		MyRunnable runnable = new MyRunnable();
//		Thread t = new Thread(runnable);
//		t.start();
		
//		MyRunnable r = new MyRunnable() {
//			public void run() {
//				for(int i=0; i<5; i++) {
//					System.out.println("inside main runnable");
//					try {
//					Thread.sleep(2000);
//					}catch(Exception e) {
//						e.printStackTrace();
//					}
//				}
//				
//			}
//		};
//		Thread t = new Thread(r);
//		t.start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("inside main runnable");
					try {
					Thread.sleep(2000);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				
			}
			
		}).start();
			 
		
		for(int i=0; i<5; i++) {
			System.out.println("inside main");
			Thread.sleep(2000);
		}

	}

}
