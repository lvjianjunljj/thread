package thread3.com.mythread.www;

public class Mythread30 extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			System.out.println("b run begin time="+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("b run end time="+System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void bService(){
		System.out.println("print bService time="+System.currentTimeMillis());
	}
}
