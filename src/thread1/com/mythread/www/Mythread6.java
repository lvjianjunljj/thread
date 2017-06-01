package thread1.com.mythread.www;

public class Mythread6 extends Thread {
	@Override
	public void run() {
		super.run();
		System.out.println("run.this="+this.isAlive());
	}
}
