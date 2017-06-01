package thread1.com.mythread.www;

public class Mythreadg1 extends Thread {
	@Override
	public void run() {
		System.out.println("Mythreadg1 run,priority is "+this.getPriority());
		Mythreadg2 thread2 = new Mythreadg2();
		thread2.start();
	}
}
