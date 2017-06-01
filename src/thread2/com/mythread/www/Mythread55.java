package thread2.com.mythread.www;

public class Mythread55 extends Thread {
	volatile public static int count;
	private static void addCount(){
		for(int i=0;i<100;i++){
			count ++;
		}
		System.out.println("count="+count);
	}
	@Override
	public void run() {
		super.run();
		addCount();
	}
}
