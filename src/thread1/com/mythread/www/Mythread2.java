package thread1.com.mythread.www;

public class Mythread2 extends Thread {
	private int count = 5;

	public Mythread2(String name) {
		super();
		this.setName(name);
	}

	public Mythread2() {
		super();
	}

	@Override
	public void run() {
		super.run();
		while (count > 0) {
			count--;
			System.out.println("由" + this.currentThread().getName()
					+ "计算，count=" + count);
		}
	}
}
