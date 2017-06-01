package thread1.com.mythread.www;

public class Mythread5 extends Thread {
	public Mythread5() {
		System.out.println("构造方法Thread.currentThread()的打印："+Thread.currentThread().getName());
		System.out.println("构造方法this.currentThread()的打印："+this.currentThread().getName());
		System.out.println("构造方法this的打印："+this.getName());
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("run方法Thread.currentThread()的打印："+Thread.currentThread().getName());
		System.out.println("run方法this.currentThread()的打印："+this.currentThread().getName());
		System.out.println("run方法this的打印："+this.getName());
	}
}
