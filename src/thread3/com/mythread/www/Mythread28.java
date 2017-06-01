package thread3.com.mythread.www;

public class Mythread28 extends Thread{
	@Override
	public void run() {
		super.run();
		try {
			System.out.println("begin time="+System.currentTimeMillis());
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
