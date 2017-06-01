package thread3.com.mythread.www;

public class Mythread31 extends Thread{
	private Mythread30 thread;
	public Mythread31(Mythread30 thread) {
		super();
		this.thread = thread;
	}
	@Override
	public void run() {
		super.run();
		synchronized (thread) {
			thread.bService();
		}
	}
}
