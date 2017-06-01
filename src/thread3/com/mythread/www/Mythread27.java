package thread3.com.mythread.www;

public class Mythread27 extends Thread{
	@Override
	public void run() {
		super.run();
		try {
			int secondalue = (int) (Math.random()*10000);
			System.out.println(secondalue);
			Thread.sleep(secondalue);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
