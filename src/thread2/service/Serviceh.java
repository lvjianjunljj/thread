package thread2.service;

import java.util.concurrent.atomic.AtomicLong;

public class Serviceh {
	public static AtomicLong atomic = new AtomicLong();
	/*synchronized*/ public void addNum(){
		System.out.println(Thread.currentThread().getName()+"加了100之后的值是："+atomic.addAndGet(100));
		atomic.addAndGet(1);
	}
}
