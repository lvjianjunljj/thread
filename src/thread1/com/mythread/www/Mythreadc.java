package thread1.com.mythread.www;

public class Mythreadc extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			System.out.println("run begin!!!");
			Thread.sleep(20000);
			System.out.println("run end!!!");
		} catch (InterruptedException e) {
			System.out.println("在沉睡中被停止！进入catch！" + this.isInterrupted());
			e.printStackTrace();
		}
	}
}
