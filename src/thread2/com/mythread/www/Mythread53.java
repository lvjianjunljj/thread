package thread2.com.mythread.www;

public class Mythread53 extends Thread {
	private boolean running = true;

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}
	@Override
	public void run() {
		super.run();
		System.out.println("进入running");
		while (running) {
		}
		System.out.println("线程停止了！！！");
	}
}
