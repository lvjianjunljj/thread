package thread1.com.mythread.www;

public class Mythreadg2 extends Thread {
	@Override
	public void run() {
		System.out.println("Mythreadg2 run,priority is "+this.getPriority());
	}
}
