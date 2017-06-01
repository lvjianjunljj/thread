package thread3.com.mythread.www;

public class Mythread29 extends Thread {
	private Mythread30 thread;
	public Mythread29(Mythread30 thread) {
		super();
		this.thread = thread;
	}
	@Override
	public void run() {
		super.run();
		try {
			synchronized (thread) {
				thread.start();
				thread.join(6000);
				//Thread.sleep(6000);
				//Thread.sleep(6000);不释放锁
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
