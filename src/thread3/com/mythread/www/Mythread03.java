package thread3.com.mythread.www;

public class Mythread03 extends Thread {
	private Object lock;
	public Mythread03(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		super.run();
		try {
			synchronized (lock) {
				System.out.println("begin wait time="+System.currentTimeMillis());
				lock.wait();
				System.out.println("end wait time="+System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
