package thread7.com.mythread.www;

public class Mythread01 extends Thread {
	public Mythread01() {
		System.out.println("构造方法中的状态："+Thread.currentThread().getState());
	}
	@Override
	public void run() {
		super.run();
		System.out.println("run方法中的状态："+Thread.currentThread().getState());
	}
}
