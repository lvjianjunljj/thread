package thread7.com.mythread.www;

public class Mythread03 extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			while(!Thread.currentThread().isInterrupted()){
				System.out.println("ThreadName="+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
