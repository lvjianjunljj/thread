package thread1.com.mythread.www;

public class Mythread3 extends Thread {
	private int count = 5;

	@Override
	public void run() {
		super.run();
		count--;
		System.out.println("由" + this.currentThread().getName() + "计算，count="
				+ count);
	}
}
