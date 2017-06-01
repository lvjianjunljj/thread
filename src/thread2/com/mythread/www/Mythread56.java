package thread2.com.mythread.www;

import java.util.concurrent.atomic.AtomicInteger;

public class Mythread56 extends Thread {
	private AtomicInteger count = new AtomicInteger(0);
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 100; i++) {
			//incrementAndGet()方法以原子方式将当前值加1并返回更新的值
			System.out.println(count.incrementAndGet());
		}
	}
}
