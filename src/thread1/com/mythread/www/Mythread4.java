package thread1.com.mythread.www;

public class Mythread4 extends Thread {
	private int count = 5;
	
	@Override
	//在run方法前加入关键字synchronized，通过锁的方法解决“非线程安全问题”
	synchronized public void run() {
		super.run();
			count--;
			System.out.println("由"+this.currentThread().getName()+"计算，count="+count);
	}
}
