package thread7.com.mythread.www;

public class Mythread02 extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			System.out.println("begin sleep");
			Thread.sleep(3000);
			System.out.println("begin sleep");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
