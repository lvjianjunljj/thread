package thread3.com.mythread.www;

public class Mythread04 extends Thread {
	private Object lock;

	public Mythread04(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		super.run();
		synchronized (lock) {
			System.out.println("begin notify time=" + System.currentTimeMillis());
			lock.notify();
			System.out.println("end notify time=" + System.currentTimeMillis());
		}
	}
}
